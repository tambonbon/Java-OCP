package Enthuware._12Annotations;

import java.util.List;

public class UncheckedWarn {
    static void doElemenets(List l) {
        // l.add generates unchecked warning because it notices the possibility of a collection..
        // .. getting corrupt due to:
        // 1. insertion of incompatible elements
        l.add("String");

        // l.get simply returns the elements from list --> no impact !!!
        System.out.println(l.get(0));
    }
}
