package RepeatFull.LambdaEx;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionEx {
    public static void main(String[] args) {
        List<LabmdaTest.Student> list = new ArrayList<>();
        LabmdaTest.Student student = new LabmdaTest.Student();
        student.setName("dfgdfg");
        Stream<LabmdaTest.Student> stram = Stream.of(student);
        Function<LabmdaTest.Student, String> f = student1 -> {return student1.name;};
        Stream<String> stringStream = stram.map(f.compose(student1 -> new LabmdaTest.Student()));
        stringStream.forEach(System.out::println);

        ;        new Function<LabmdaTest.Student, String>() {
            @Override
            public String apply(LabmdaTest.Student student) {
                return null;
            }

            @Override
            public <V> Function<V, String> compose(Function<? super V, ? extends LabmdaTest.Student> before) {
                return Function.super.compose(before);
            }

            @Override
            public <V> Function<LabmdaTest.Student, V> andThen(Function<? super String, ? extends V> after) {
                return Function.super.andThen(after);
            }
        };
    }
}
