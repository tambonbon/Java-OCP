package Enthuware._10StreamsLambda.Lambda;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlavorsReduce {
   
    public static void flavor1ReturningOptional() {
        IntStream intStream = IntStream.range(1, 5);
        OptionalInt sum = intStream.reduce((a,b) -> a+b); // NOT passing identity value
        // ---> result is OptionalInt

        // the following is equivalent (not use IntStream)
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4);
        Optional<Integer> sumNormalStream = stream1.reduce((a,b) -> a+b);
    }

    public static void flavor2ReturningInt() {
        IntStream intStream = IntStream.range(1, 5);
        int sum = intStream.reduce(0, (a,b) -> a+b);
    }
}
