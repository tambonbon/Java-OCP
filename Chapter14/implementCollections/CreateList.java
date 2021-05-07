package Chapter14.implementCollections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CreateList {
    public static void main(String[] args) {
        // 3 ways to create List
        String[] array = new String[] {"a", "b", "c"};
        
        List<String> asList = Arrays.asList(array);
        List<String> asList1 = Arrays.asList("a", "b", "c");

        List<String> of     = List.of(array);
        List<String> of1    = List.of("a", "b", "c");

        List<String> copy   = List.copyOf(asList);

        asList.set(1, "2");
        System.out.println(asList);

        Iterator<String> iter = asList.iterator();
        while(iter.hasNext()) {
            String string = iter.next();
            System.out.println(string);
        
        }
        // of.replaceAll(x -> "haha"); // CANT mutate 
        // asList.add("d"); // CANT MUTATE 
        // of1.add("d"); // CANT MUTATE
        asList.set(1, "d");
        // of.set(1, "d");

        for (String string : of1) {
            System.out.println(string);
        }
    }
}
