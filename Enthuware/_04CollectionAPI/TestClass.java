package Enthuware._04CollectionAPI;

import java.util.Arrays;

public class TestClass {
    static String[] sa = {"a", "aa", "aaa", "aaaa"};
    static {
        Arrays.sort(sa);
    }
    public static void main(String[] args) {
        for (String string : sa) {
            System.out.println(string);
        }
        String search = "";
        if (args.length != 0) search = args[0];
        System.out.println(Arrays.binarySearch(sa, search));
    }
}
