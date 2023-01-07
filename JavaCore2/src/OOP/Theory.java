package OOP;

public class Theory implements Test {
    /*
    Полиморфизм
    Полиморфизм - это свойство системы, которая позволяет использовать объекты с одинаковым интерфейсом без приведения типов.

    Полиморфизм реализуется при помощи наследования и переопределения методов.
    При наследовании классы наследуют поля и методы родительского класса.
    При переопределении метода происходит переопределение его реализации.

    Полиморфизм позволяет создавать системы, в которых классы могут использоваться вместе независимо от их конкретной реализации.
    При этом не нужно знать конкретный тип объекта, достаточно знать, что объект имеет определенное поведение.

    Пример:
    Пусть у нас есть родительский класс Animal и два наследника Dog и Cat.
    В родительском классе определен метод voice, который выводит на экран "Animal voice".
    В классе Dog переопределен этот метод, он выводит на экран "Dog voice".
    В классе Cat переопределен этот метод, он выводит на экран "Cat voice".
    Мы можем создать объекты классов Dog и Cat и положить их в массив типа Animal.
    Так как классы Dog и Cat наследуют Animal, то объекты этих классов можно положить в массив типа Animal.
    При вызове метода voice у объектов массива, будет вызываться переопределенный метод voice для каждого класса.
    В данном случае для объектов класса Dog будет вызываться метод voice класса Dog, а для объектов класса Cat будет
    вызываться метод voice класса Cat.

    Полиморфизм реализуется при помощи:
    1) Наследования
    2) Переоп
     */

    public static void main(String[] args) {
        Theory theory = new Theory();
        Test test = new Theory();
        }

    @Override
    public void test() {
        System.out.println("Test");
    }
}

