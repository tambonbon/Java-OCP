package Enthuware._04CollectionAPI;

import java.util.ArrayList;
import java.util.List;

public class InsertList {
    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add(1, "c");
        list.forEach(System.out::println); // a c b, NOT a b c

        List list2 = new ArrayList<>(list.subList(1, 1)); // subList(1,1) returns an empty list
        list.addAll(list2);
        System.out.println(list);


    }
}
