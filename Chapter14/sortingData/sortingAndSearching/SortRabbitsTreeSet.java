package Chapter14.sortingData.sortingAndSearching;

import java.util.Set;
import java.util.TreeSet;

import Chapter14.sortingData.comparator.Duck;

public class SortRabbitsTreeSet {
    static class Rabbit { int id; }
    public static void main(String[] args) {
        // Set<Duck> ducks = new TreeSet<>();
        // ducks.add(new Chapter14.sortingData.Duck("Puddles"));

        Set<Rabbit> rabbits = new TreeSet<>();
        rabbits.add(new Rabbit()); // ClassCastException (not implemented Comparable)
        Set<Rabbit> rabbits2 = new TreeSet<>((r1, r2) -> r1.id - r2.id);
        rabbits2.add(new Rabbit());
    }
}
