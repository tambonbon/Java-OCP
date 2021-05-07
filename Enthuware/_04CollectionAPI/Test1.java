package Enthuware._04CollectionAPI;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List s1 = new ArrayList( );
        try {
            while (true) { // cause OutOfMemoryEx
                s1.add("asd");
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println(s1.size());
    }
}
