package Enthuware._10StreamsLambda.Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestMax {
   public static void main(String[] args) {
       List<Integer> nums = Arrays.asList(1, 3, 2, 8, 5);
       // max requires a Comparator parameter
       // max returns Optional !!!
       // Optional<T> max(Conparator<? super T> comparator)
       int max = nums.stream().max(Comparator.comparing(a->a)).get();

       // this kind of reduce returns an Optional
       Optional<Integer> max2 = nums.stream().reduce((a,b) -> a > b ? a : b);
       System.out.println(max2); // Optional[8]

       int max3 = nums.stream()
                        .reduce(Integer.MIN_VALUE, (a,b) -> a>b?a:b);
        System.out.println(max3);
   } 
}
