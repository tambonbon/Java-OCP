package Chapter14.sortingData;

public class LegacyDuck implements Comparable {
    private String name;
    public int compareTo(Object obj) {
        LegacyDuck duck = (LegacyDuck) obj; // cast because no generics
        return name.compareTo(duck.name);
    }

}
