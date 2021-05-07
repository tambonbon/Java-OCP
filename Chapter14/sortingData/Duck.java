package Chapter14.sortingData;

import java.util.ArrayList;
import java.util.Collections;

public class Duck implements Comparable<Duck> {
    private String name;
    public Duck(String name) {
        this.name = name;
    }
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }
    public int compareTo(Duck duck) {
        return name.compareTo(duck.name);
    } // return negative number if current object is smaller than argument to compareTo()

    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack!"));
        ducks.add(new Duck("Puddles!"));
        Collections.sort(ducks);
        System.out.println(ducks);
    }
       
}
