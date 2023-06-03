package RepeatFull.LambdaEx;

import java.util.ArrayList;
import java.util.List;

// Лямбда выражения по сути замещают анонимные классы, но компилятором в любом случае преобразуются в анонимные классы
public class LabmdaTest {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        LabmdaTest labmdaTest = new LabmdaTest();
        labmdaTest.studentInfo(studentList, new CheckStudent() {
            @Override
            public boolean check(Student student) {
                return student.isAMan.equals(true);
            }
        });
        labmdaTest.studentInfo(studentList, student -> student.isAMan.equals(true));
    }

    public static class Student {
        String name;
        Integer avereg;
        Boolean isAMan;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAvereg() {
            return avereg;
        }

        public void setAvereg(Integer avereg) {
            this.avereg = avereg;
        }

        public Boolean getAMan() {
            return isAMan;
        }

        public void setAMan(Boolean AMan) {
            isAMan = AMan;
        }
    }

    public static class ChildStudent extends Student {

    }

    public void studentInfo(List<?> objects, CheckStudent checkStudent) {

    }


}
