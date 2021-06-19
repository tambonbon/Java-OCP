package Enthuware._10StreamsLambda.Lambda;

import java.util.Arrays;
import java.util.List;

public class GetMaxNum {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3,4,5,1,9,2);

        // valid max:
        System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a,b) -> a>b?a:b));
        System.out.println(ls.stream().max(Integer::compare).get());

        // invalid max:
        System.out.println(ls.stream().max(Integer::max).get());
    }
}
