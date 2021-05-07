package Chapter14.sortingData.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Sort an object that did not implement Comparable,
 * or sort objects in different ways at different times */
public class Duck implements Comparable<Duck> {
   private String name;
   private int weight;
   

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }
    @Override
    public int compareTo(Duck o) {
        // TODO Auto-generated method stub
        return name.compareTo(o.name);
    }

    public static void main(String[] args) {
        Comparator<Duck> byWeight = new Comparator<Duck>() {
            public int compare(Duck d1, Duck d2) {
                return d1.getWeight() - d2.getWeight();
            } // custom comparator
        };

        Comparator<Duck> byWeight2 = (d1, d2) -> d1.getWeight() - d2.getWeight();
        Comparator<Duck> byWeight3 = Comparator.comparing(Duck::getWeight);

        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
        Collections.sort(ducks);
        System.out.println(ducks);
        Collections.sort(ducks, byWeight); // use overloadded method
        System.out.println(ducks);
    }
}
