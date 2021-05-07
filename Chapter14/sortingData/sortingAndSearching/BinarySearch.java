package Chapter14.sortingData.sortingAndSearching;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BinarySearch {
    public static void main(String[] args) {
        var list = Arrays.asList("Fluffy","Hoppy");
        var list1 = Arrays.asList("Hoppy","Fluffy");
        Comparator<String> c = Comparator.reverseOrder();
        Comparator<String> c1 = Comparator.naturalOrder();
        var index = Collections.binarySearch(list, "Hoppy", c); 
        var indes1 = Collections.binarySearch(list1, "Fluffy", c1);
        System.err.println(index);
        System.out.println(indes1);
    }
  
}
