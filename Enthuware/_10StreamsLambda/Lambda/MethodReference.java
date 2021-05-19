package Enthuware._10StreamsLambda.Lambda;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    static interface Carnivor{
        default int calories(List<String> food) {
            return food.size()*100;
        }
        int eat(List<String> foods);
    }

    static class Tiger implements Carnivor {
        @Override
        public int eat(List<String> foods) {
            System.out.println("Eating " + foods);
            return foods.size()*200;
        }
    }

    public static int size(List<String> names) {
        return names.size()*2;
    }

    public static void process(List<String> names, Carnivor c) {
        c.eat(names);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("a", "b", "c");
        Tiger tiger = new Tiger();

        // Valid method references
        process(names, tiger::eat); 
        // process expects a List<String> and a Carnivore as arguments
        // note that Carnivor has EXACTLY 1 abstract method ---> a FI ----> can pass a reference to a method
        process(names, tiger::calories);
        process(names, MethodReference::size);

        // Invalid method ref
        process(names, Tiger::eat); // this refers to a static method `eat`, but no such one
        process(names, Carnivor::calories); // carnivor is a interface
    }

}
