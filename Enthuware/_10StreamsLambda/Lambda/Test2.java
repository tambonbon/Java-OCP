package Enthuware._10StreamsLambda.Lambda;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        int[][] iaa = {{1,2}, {3,4}, {5,6}};
        long count = 
            Stream.of(iaa).flatMapToInt(IntStream::of)
                    .map(i -> i+1).filter(i -> i%2 != 0)
                    .peek(System.out::print).count();
        System.out.println(count); //3573, bc of peek

        // ---

        Stream<Integer> values = IntStream.rangeClosed(10, 15).boxed(); 
        
    }
    
}
