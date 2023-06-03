package RepeatFull.LambdaEx;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

// Используется для получения объекта
public class SupplierEx {
    public static void main(String[] args) {
        List<LabmdaTest.Student> list = new ArrayList<>();

        new Supplier<>() {
            @Override
            public Object get() {
                return null;
            }
        };
    }
}
