package Enthuware._10StreamsLambda.Parallel;

import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        /* 
        1. The forEachOrdered method processes the elements of the stream in the order they are present in the underlying source. In this case, the underlying source of the first stream is the "source" ArrayList. In this ArrayList, the elements are in the required order already and that is the order in which they will be printed even if the stream is a parallel stream because of forEachOrdered.

2. Parallel streams allow operations such as peek and map to execute on the elements of the stream from multiple threads. This means they can be executed in any order. Therefore, in this case, the code that adds the elements to the destination (that is, the call to peek at //2) can add elements to destination list in any order. This means that, effectively, the order of elements in destination is unknown. This is the problem that really needs to be fixed here. Changing parallelStream to stream on the source will rectify this problem because then the elements will be added to destination in the same order.

Observe that there is no benefit in using forEachOrdered on a parallel stream if that is all that you want to do with the stream. However, if you want to apply expensive intermediate operations such filter, peek, or map, and still process the elements in order at the end, using forEachOrdered might be useful because the intermediate operations can still be executed in parallel.

You should go through this article from Oracle to understand this in detail: https://docs.oracle.com/javase/tutorial/collections/streams/parallelism.html
 */


        Stream<String> names = Stream.of(
            "Tam Nguyen", "Daniel Lau", "Werner de Groot"
        );
        Stream<String> firstName = names.map(x -> x.split(" ")[0]);
        firstName.forEach(System.out::println);
    }
}
