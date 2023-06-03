public class Main {
    public static int i = 10;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String string = "12.84";
        double parseDouble = Double.parseDouble(string);
        long round = Math.round(parseDouble);

        Outer.Nested a = new Outer.Nested();
        Outer.Inner b = new Outer().new Inner();
    }


}