package Enthuware._04CollectionAPI;

import java.util.List;

public class List1 {
    public static void main(String[] args) {
        var numA = new Integer[]{1, null, 3};

        var list1 = List.of(numA); // Runtime error..
        // .. because List.of and List.copyOf NOT support null values
    }
}
