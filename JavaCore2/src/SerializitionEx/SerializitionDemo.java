package SerializitionEx;

import java.io.*;
import java.nio.file.Path;

public class SerializitionDemo {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "student.out");
        Student student = new Student("Ivan", 25);
        writeObject(student, path);
        readObject(path);
    }

    public static void writeObject(Student student, Path path) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path.toFile()))){
            oos.writeObject(student);
        }
    }

    public static void readObject(Path path) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path.toFile()))){
            Object object = ois.readObject();
            System.out.println(object);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
