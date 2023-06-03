package generics;

import java.util.ArrayList;
import java.util.HashSet;

public class Parameterized {
    public static void main(String[] args) {

        X<Integer> x = new Y<>(1);
       Y<Double> y = new Y<>(333.333);
       ArrayList<Integer> arrayList = new ArrayList<>();

    }

    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}

class info<T> {
    private T value;

    public info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "info{" +
               "value=" + value +
               '}';
    }
}

class X<T extends Integer>{

    public void print() {
    }
}
class Y<T extends Number> extends X{
    T value;

    Y(T value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }

    public void testChild() {
        System.out.println("Child");
    }
}

