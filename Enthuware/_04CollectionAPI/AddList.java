package Enthuware._04CollectionAPI;

import java.util.ArrayList;
import java.util.List;

public class AddList {
    
    public static void main(String[] args) {
        List list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");

        list1.add(1, "c"); // this will add c between a and b !!!

        List list2 = new ArrayList(list1.subList(1, 1));
        System.out.println(list2); // empty list

        list1.addAll(list2);
        System.out.println(list1);
    }
}
