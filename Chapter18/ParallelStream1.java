import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream1 {
    public static void main(String[] args) {
        System.out.println(
            List.of(1,2,3,4)
                .stream()
                .findAny().get());

        System.out.println(
            List.of(1,2,3,4)
                .parallelStream()
                .findAny().get());
        

        System.out.println(
            List.of(1,2,3,4)
                .stream()
                .skip(1)
                .limit(2)
                .findFirst().get()
        );
        
        System.out.println(
            List.of(1,2,3,4)
                .parallelStream()
                .skip(1)
                .limit(2)
                .findFirst().get()
        );

        System.out.println(
            List.of('w','o','l','f')
                .stream()
                .reduce("",
                        (s1,c) -> s1 + c,
                        (s2,s3) -> s2 + s3)
        );
        
        System.out.println(
            List.of('w','o','l','f')
                .parallelStream()
                .reduce("",
                        (s1,c) -> s1 + c,
                        (s2,s3) -> s2 + s3)
        );

        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
        System.out.println(set);

        Stream<String> ohMy = Stream.of("lions", "tigers","bears").parallel();
        ConcurrentMap<Integer, String> map = ohMy.collect(
            Collectors.toConcurrentMap(String::length, k ->k, (s1,s2) -> s1 + "," + s2)
        );
        System.out.println(map);
        System.out.println(map.getClass());

        var ohMy2 = Stream.of("lions", "tigers","bears").parallel();
        ConcurrentMap<Integer, List<String>> map2 = ohMy2.collect(
            Collectors.groupingByConcurrent(String::length)
        );
        System.out.println(map2);
    }

    public List<Integer> addValue(IntStream source) {
        var data = Collections.synchronizedList(new ArrayList<Integer>());
        source.filter(s -> s%2 == 0)
                .forEach(i -> { data.add(i) ; }); // STATEFUL: DONT DO THIS !!!
        return data;
    }
}
