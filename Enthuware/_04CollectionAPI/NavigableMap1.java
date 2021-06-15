package Enthuware._04CollectionAPI;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap1 {
    public static void main(String[] args) {
        NavigableMap<String, String> mymap = new TreeMap<>();
        mymap.put("a", "apple");
        mymap.put("b", "boy");
        mymap.put("c", "cat");
        mymap.put("a", "apple1");
        mymap.put("b1", "boy1");
        mymap.put("c1", "cat1");

        mymap.pollFirstEntry(); // REMOVE & RETURN key-value with the LEAST KEY
        // --> removes a-apple
        System.out.println(mymap);

        mymap.pollLastEntry();
        System.out.println(mymap);
        // removes c1-cat1

        NavigableMap<String, String> tailMap = mymap.tailMap("b1", false); // false is NOT INCLUSIVE
        // returns a view of portion of this map whose keys are greater than b1
        System.out.println(tailMap);
        // {c=cat}

        System.out.println(tailMap.pollFirstEntry()); // removes c-cat
        System.out.println(mymap); // {b=boy, b1=boy1}
        // tailmap is backed by original map ---> this affects the original map as well
    }
}
