package Enthuware._10StreamsLambda.Lambda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapToInt {
    public static void main(String[] args) {
        int[][] twoDArray = {{1,2}, {3,4}, {5,6}};
        long count = 
            Stream.of(twoDArray).flatMapToInt(IntStream::of) // CANT use twoDArray.stream()
                    .map(i -> i+1).filter(i -> i%2 != 0)
                    .peek(System.out::print).count();
        System.out.println(count); //3573, bc of peek

        // ---
        int[] oneDArray = {1, 2, 3, 4, 5, 6};
        long count2 = Stream.of(oneDArray)
            .flatMapToInt(x -> IntStream.of(x)) // Must use flatMap here, because x is int[] and IntStream.of takes int
            .map(i -> i+1)
            .filter(i-> i%2!=0)
            .peek(System.out::print)
            .count();
        assertEquals(count, count2);

        Stream<Integer> values = IntStream.rangeClosed(10, 15).boxed(); 
        
    }
    
}
