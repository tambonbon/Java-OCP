package Enthuware._04CollectionAPI;

import java.util.ArrayList;
import java.util.List;

public class RemoveInList {
    /* 
    remove(Object o) method ONLY REMOVES THE FIRST OCCURENCE and RETURN TRUE IF FOUND
     */
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");

        if (list.remove("a")) { // 1
            if (list.remove("a")) { // 2
                list.remove("b") ; // 3
            } else list.remove("c"); // NOT GO HERE
        }

        System.out.println(list); // c
    }
}
