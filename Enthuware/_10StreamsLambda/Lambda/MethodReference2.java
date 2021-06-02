package Enthuware._10StreamsLambda.Lambda;

import java.util.Arrays;
import java.util.List;

public class MethodReference2 {
    static interface Omnivore {
        /* Omnivore is a FI ---> applicable for method reference */
        default int calories(List<String> food) {
            return food.size()*50;
        }

        static int size(List<String> food) {
            return 100;
        }

        int eat(List<String> foods);
    }

    static class Elephant implements Omnivore {
        @Override
        public int eat(List<String> foods) {
            System.out.println("Eat " + foods);
            return foods.size()*100;
        }

        public static int sizeElephantNoArgs() {
            return 100;
        }

        public static int sizeElephant(List<String> name) {
            return 100;
        }

        public static void sizeElephantVoid(List<String> name) {
        }

        public int sizeElephantNotStatic(List<String> name) {
            return 100;
        }
        // @Override
        // public static int size(List<String> food) { // WRONG, CANT override overridden static method
        //     return 200;
        // }

        static void process(List<String> names, Omnivore omnivore) {
            omnivore.eat(names);
        }
    }
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList("a","b")  ;
        Elephant elephant = new Elephant();

        /* Valid codes */
        Elephant.process(names, Omnivore::size); // OK, because size is static

        Elephant.process(names, elephant::eat); // OK ..
        // .. because eat is an instance method (non-static) for object elephant

        Elephant.process(names, Elephant::sizeElephant); // OK, because sizeElephant is static
        Elephant.process(names, elephant::sizeElephantNotStatic); // OK 

        /* Invalid codes */
        Elephant.process(names, Omnivore::eat); // Invalid ..
        // ..because eat (and calories) in Omnivore are non-static
        
        Elephant.process(names, Elephant::sizeElephantNoArgs); // Only compatible with parameter List<String>...
        // .. because `process` invokes `eat()`, which takes parameter of List<String>

        Elephant.process(names, Elephant::sizeElephantVoid); // Only compatible with int ...
        // .. because `eat` returns an Int

        /* Rule of thumb for method reference:
        1. Look for the return type of the invocation (not the method)
        2. Look for the parameter of that method
        
        In this case, `process` takes: 
        1. List<String>
        2. an object of type Omnivore.. this is the invocation of method reference
        *** That object returns an int ---> METHOD REF MUST INVOKE ON METHOD RETURNING INT 
        
        ---> Further, a Class::method is ONLY POSSIBLE IF method is STATIC <---- 
        ---> Likewise, a instance::method is ONLY POSSIBLE IF method is NON-STATIC <---- */
    }
}
