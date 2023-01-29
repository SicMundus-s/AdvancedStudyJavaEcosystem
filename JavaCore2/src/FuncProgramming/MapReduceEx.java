package FuncProgramming;

import java.util.stream.Stream;

public class MapReduceEx {
    /**
     * У нас есть 3 массива, в кадом из которыз по 1 миллону значений. Необходимо распаралелить вычесления.
     */

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .parallel()
                .map(x -> x * x)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
