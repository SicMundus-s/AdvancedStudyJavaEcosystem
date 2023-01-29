package SerializitionEx;

import java.io.Serial;

public class Student implements java.io.Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String nam;
    private int age;

    public Student(){

    }
    public Student(String nam, int age) {
        this.nam = nam;
        this.age = age;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nam='" + nam + '\'' +
                ", age=" + age +
                '}';
    }
}
