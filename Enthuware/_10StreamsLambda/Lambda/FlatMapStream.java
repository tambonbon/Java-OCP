package Enthuware._10StreamsLambda.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapStream {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("a", "b");
        List<String> l2 = Arrays.asList("1", "2");

        // 2 ways of using flatmap here:

        Stream.of(l1, l2).flatMap(
            x -> Stream.of(x)
        ).forEach(System.out::println); // [a, b] [1, 2]

        Stream.of(l1, l2).flatMap(
            x -> x.stream()
        ).forEach(System.out::println); // a b 1 2
    }
}
