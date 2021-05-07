import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunctionalInterface {
    public static void main(String[] args) {
        Supplier<ArrayList<String>> s3 = ArrayList<String>::new;
        ArrayList<String> a1 = s3.get();
        a1.add("e");
        System.out.println(a1);
        Stream<String> objStream = Stream.of("penguin", "fish");
        Stream<String> objStream1 = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(s -> s.length());
        intStream.forEach(System.out::println);
        objStream1.map(String::length).forEach(System.out::println);

        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(
            Collectors.groupingBy(String::length)
        );
        System.out.println(map);

        List<Integer> x1 = List.of(1,2,3);
        List<Integer> x2 = List.of(4,5,6);
        List<Integer> x3 = List.of();

        Stream.of(x1, x2, x3)
                            .flatMap(x -> x.stream())
                            .forEach(System.out::print);

        Stream<Double> dStream = Stream.of(1.0);
        DoubleStream dStream3 = dStream.mapToDouble(x -> x);
        // IntStream iStream = dStream.mapToInt(x -> (int) x);
        // int a = dStream.mapToInt(x -> x);
        Stream<Integer> s = Stream.of(1);
        DoubleStream dStream2 = s.mapToDouble(x -> x);
        
        IntStream.range(1, 6)
                                    .mapToObj(i->i)
                                    .collect(Collectors.toList())
                                    .forEach(System.out::println);

        double count = 1;
        int count1 = (int)1.0;

        List<Integer> names = Arrays.asList(1,2,3);
        names.forEach(x->x=x+1);
    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }


}