package RepeatFull.LambdaEx;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {
        List<LabmdaTest.Student> list = new ArrayList<>();
        list.forEach(s -> {
            s.name = "suplierTest";
            s.avereg = 324;
            System.out.println(s);});

        new Consumer<>() {
            @Override
            public void accept(Object o) {

            }

            @Override
            public Consumer<Object> andThen(Consumer<? super Object> after) {
                return Consumer.super.andThen(after);
            }
        };
    }
}
