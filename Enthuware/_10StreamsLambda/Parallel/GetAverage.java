package Enthuware._10StreamsLambda.Parallel;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GetAverage {
    public static void main(String[] args) {
        // IntStream NOT have collect method
        var nums = IntStream.range(1, 5);
        var nums2 = IntStream.range(1, 5);
        var nums3 = IntStream.range(1, 5);

        // make average
        double average1 = nums.mapToObj(x -> x).collect( // mapToObj returns Stream
            Collectors.averagingDouble(element -> element)
        );
        System.out.println(average1);

        double average2 = nums2.average().getAsDouble();
        System.out.println(average2);

        double average3 = nums3.mapToDouble(x -> x).average().getAsDouble();
        System.out.println(average3);
        
    }
}
