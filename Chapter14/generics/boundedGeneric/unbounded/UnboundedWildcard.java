package Chapter14.generics.boundedGeneric.unbounded;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcard {
    public static <T> void printList(List<T> list) {
        for (Object x : list) {
            System.out.println(x);
        }
    }

    public static void printListUnbounded (List<?> list) {
        for (Object x : list) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);
        printListUnbounded(keywords);
    }
}
