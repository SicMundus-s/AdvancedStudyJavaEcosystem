package RepeatFull.InputOutputNIO;

public class SerizilationEx {
    public static void main(String[] args) {

    }

    public static class Student1 {
        private static final long serialVersionUID = 1L;
        int age;
        String name;

    }

    /**
     * Обновленная версия наша класса
     */
    public static class Student2 {
        private static final long serialVersionUID = 2L; // Инкрементим версию
        int age;
        String name;

        Double salary; // Новое поле

    }
}
