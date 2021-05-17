package Enthuware._04Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListOfVsNewList {
    public static void main(String[] args) {
        // Create an unmodifiable List via List.of
        List<String> list1 = List.of("a", "b");
        Set<String> set = new HashSet<>();
        set.addAll(list1);
        System.out.println(set + "..." + list1);
        // list1.clear(); // UnsupportedOperationException
        System.out.println(set + "..." + list1); //

        // Create a new ArrayList object with unmodifiable list as argument
        // ---> the list itself is NOT unmodifiable, just a regular ArrayList
        List<String> list2 = new ArrayList<>(List.of("a", "b"));
        set = new HashSet<>();
        set.addAll(list2);
        System.out.println(set + "..." + list2);
        list2.clear();
        System.out.println(set + "..." + list2);
        System.out.println(set.size()); // 2
        System.out.println(list2.size()); // 0
    }
}
