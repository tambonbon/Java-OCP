package Enthuware._10StreamsLambda.FI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Test2  {
    
    
    public static void main(String[] args) {
        List<Double> dList = Arrays.asList(10.0, 20.0);
        DoubleFunction<Double> df = x -> x + 10 ;
        // 2 streams on SAME list ---> no compilation error
        dList.stream().flatMap(x -> Stream.of(x*x*x)).forEach(System.out::println);
        dList.stream().map(x -> x + 10).forEach(System.out::println);
        dList.stream().flatMap(x -> Stream.of(x + 10)).forEach(System.out::println);
        dList.stream().forEach(d -> System.out.println(d));
    }
    
}
