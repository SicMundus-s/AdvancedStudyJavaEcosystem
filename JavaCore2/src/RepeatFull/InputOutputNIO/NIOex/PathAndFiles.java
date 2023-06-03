package RepeatFull.InputOutputNIO.NIOex;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class PathAndFiles {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("fdgdfgdf"); //
        Path path1 = Paths.get("sdfgsfdg");
        path.resolve("sgsdg"); // Объединяет 2 пути
        path.relativize(path1); // Находит относительный путь path от path1

        // -------------------------

        Files.exists(path); // Проверяет есть ли файл по этому пути
        Files.isReadable(path);
        Files.isWritable(path);
        Files.isExecutable(path);// Проверяет права на файл
        Files.size(path); // Выводит размер файла в байтах
        Files.copy(path, path1); // Копирует файл
        Files.delete(path); // Удаляет файл
        Files.deleteIfExists(path); //

        // Files.walkFileTree() делает обход по всей директории

    }

    class mySimpleFileVisitor implements FileVisitor<Path> {

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            return FileVisitResult.CONTINUE; // Enum
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            return null;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            return null;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            return null;
        }
    }
}
