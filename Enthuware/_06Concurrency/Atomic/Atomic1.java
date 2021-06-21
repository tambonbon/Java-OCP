package Enthuware._06Concurrency.Atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Atomic1 {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger();
        Stream<Integer> stream = Stream.of(11,11,23,33).parallel();
        stream.filter((
            e -> {
                ai.incrementAndGet();
                return e%2 == 0;
            }
        )).forEach(System.out::println);;
        System.out.println(ai); // 0
        // because filter NOT do anything until terminal operation is invoked
        // ^^^ no terminal ops .... sucks

        // if forEach is added --> 4
    }
}
