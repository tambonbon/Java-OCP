package Chapter14.sortingData.sortingAndSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortRabbits {
    static class Rabbit { int id; }
    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit());
        // Collections.sort(rabbits); // NOT compiled (object needs to implement Comparable)

        Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id; 
        // Comparator is useful when we want to specify sort order without using compareTo
        Collections.sort(rabbits, c); 
    }
}
