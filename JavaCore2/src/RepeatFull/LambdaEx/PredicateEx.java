package RepeatFull.LambdaEx;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Используется для выборки по условиям(например removeIf)
public class PredicateEx {
    public static void main(String[] args) {
        List<LabmdaTest.ChildStudent> studentList1 = new ArrayList<>();
        Predicate<LabmdaTest.Student> predicate = s -> s.isAMan; // Можно использовать что-то, что является super классом(родителем) для ChildStudent
        studentList1.removeIf(predicate);

        new Predicate<LabmdaTest.ChildStudent>() {
            @Override
            public boolean test(LabmdaTest.ChildStudent childStudent) {
                return false;
            }

            @Override
            public Predicate<LabmdaTest.ChildStudent> and(Predicate<? super LabmdaTest.ChildStudent> other) {
                LabmdaTest.Student student = new LabmdaTest.ChildStudent();
                return Predicate.super.and(other);
            }

            @Override
            public Predicate<LabmdaTest.ChildStudent> negate() {
                return Predicate.super.negate();
            }

            @Override
            public Predicate<LabmdaTest.ChildStudent> or(Predicate<? super LabmdaTest.ChildStudent> other) {
                return Predicate.super.or(other);
            }
        };
    }
}
