package Chapter14.sortingData.comparator;

import java.util.Comparator;

public class Squirrel {
    private int weight;
    private String species;

    public Squirrel(int weight, String species) {
        this.weight = weight;
        this.species = species;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public static void main(String[] args) {
        Squirrel squirrel1 = new Squirrel(10, "Red Squirrel");
        Squirrel squirrel2 = new Squirrel(20, "Blue Squirrel");
        MultifieldComparator comparator = new MultifieldComparator();
        comparator.compare(squirrel1, squirrel2);
        System.out.println(comparator.toString());
    }
}

class MultifieldComparator implements Comparator<Squirrel> {
    public int compare(Squirrel s1, Squirrel s2) {
        int result = s1.getSpecies().compareTo(s2.getSpecies());
        if (result != 0) return result;
        return s1.getWeight() - s2.getWeight(); 
    }  // toooo complicated
    
    Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies)
                                        .thenComparingInt(Squirrel::getWeight);
}