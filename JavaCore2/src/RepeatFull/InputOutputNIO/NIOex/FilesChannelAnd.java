package RepeatFull.InputOutputNIO.NIOex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.List;

public class FilesChannelAnd {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("dfgdfg");
        FileChannel channel = fileInputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
        channel.read(byteBuffer);
        StringBuilder stringBuilder = new StringBuilder();
        while (channel.read(byteBuffer) > 0) {
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                stringBuilder.append(byteBuffer.getChar());
            }
            byteBuffer.clear(); // Ставит позицию на 0(Изменять указатель чтения из буфера на 0),
            // тем самым мы можем перезаписывать данные начинаю с нулевой позиции(старые данные затираются, новые добавляются)
            byteBuffer.flip(); // Меняет работу буффера на противоположную(чтение/запись)
            channel.read(byteBuffer);
        }
    }
}
