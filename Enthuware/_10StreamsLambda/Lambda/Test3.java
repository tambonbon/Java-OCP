package Enthuware._10StreamsLambda.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test3 {
    /* 
    This is an example of when a stream CANNOT be re-used
     */
   public static void main(String[] args) {
       List<Integer> primes = Arrays.asList(2,3,5,6,11, 12, 18);
       Stream<Integer> stream = primes.stream(); // HERE, the stream is sourced ONLY ONCE

       long count1 = stream.filter(x -> x < 10).count();
       System.out.println(count1);

       long count = stream.filter(x -> x < 10).count();
       System.out.println(count); // give RT exception
   } 
}

