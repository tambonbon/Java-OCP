package Enthuware._10StreamsLambda.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3);
        
        // double sum1 = ls.stream().sum() // WRONG! No sum() in normal stream
        double sum2 = ls.stream().mapToInt(x -> x) // this maps stream to IntStream !
                                .sum();

        double sum3 = ls.stream().reduce(0, (a,b) -> a+b);

        System.out.println(sum2);
        System.out.println(sum3);

        // ----

        List<String> names = Arrays.asList("charles", "chunk", "chuk");
        /* 
        Count ALWAYS returns long !!!!!! */
        long count1 = names.stream()
                        .filter(name -> name.length() > 0)
                        .collect(Collectors.counting());
        int count2 = (int) names.stream()
                        .filter(name -> name.length()>0)
                        .count();
        System.out.println(count1);
        System.out.println(count1==count2);

        // ---

        List<Integer> list = Arrays.asList(1,2,3);

        System.out.println(list.stream().mapToInt(x->x).sum());
        System.out.println(list.stream().reduce(0, (a,b) -> a+b));
        System.out.println(list.stream()
                                .collect(Collectors.mapping(
                                    x->x, // unbox the Intefer objects to an ints
                                     Collectors.summarizingInt(x->x)))
                                .getSum()); // getSum is from IntSummaryStatistics
        System.out.println(list.stream()
                                .collect(Collectors.summarizingInt(x->x)).getSum());


    }
    
}
