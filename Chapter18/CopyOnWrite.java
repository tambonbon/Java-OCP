package Chapter18;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public class CopyOnWrite {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = List.of(4, 3, 42);
        List<Integer> favNum = new CopyOnWriteArrayList<>(List.of(4,3,42));

        for (var integer : list) {
            System.out.println(integer + " ");
            // list.add(9); // NOT compiled, because list is IMMUTABLE
        }
        for (var integer : favNum) {
            System.out.println(integer + " ");
            favNum.add(9);
        }

        Stream.of(list).forEach(System.out::println);
        Stream.of(favNum).forEach(System.out::println);

        System.out.println("Size: " + list.size());
        System.out.println("Size: " + favNum.size());
    }
}
