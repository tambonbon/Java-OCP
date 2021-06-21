package Enthuware._06Concurrency.Atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Atomic2 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(1);

        Stream<String> stream = Stream.of("old", "king", "cole", "was", "a", "meerry", "old", "soul").parallel();
        // stream consists of 8 elements --> JVM may split this stream into 8 streams, 
        // and invoke filter operaiton on each of them
        // If ^^^^that^^^^  happen ---> atomicInteger will be incremented 8 times

        // However, it's possible JVM not to split stream at all
        // in this case, it will invoke the filter on first element (which return true)
        // then invoke allMatch predicate (which then return FALSE bc "old".indexOf("o") = 0)
        // ---> JVM knows there's no point in checking other elements because result is FALSE anyway
        // Apply that logic ---> atomic will be incremented any number of times between 1 and 8
        stream.filter(e -> {
            atomicInteger.incrementAndGet();
            return e.contains("o");
        }).allMatch(x -> x.indexOf("o") > 0);

        System.out.println("AI + " +atomicInteger);
    }
}
