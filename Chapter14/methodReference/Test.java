package Chapter14.methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        // Calling static methods
        Consumer<List<Integer>> methodRef = Collections::sort; // calling static methods

        // Calling Instance Methods on a Particular Object
        var str = "abc";
        Predicate<String> methodRef2 = str::startsWith;
        System.out.println(methodRef2);

        // Calling instance methods on a param
        Predicate<String> methodRef3 = String::isEmpty;

        // Calling Constructors
        // constructor reference ---> uses new instead of a method && instantiate an objnect
        Supplier<ArrayList> methodRef4 = ArrayList::new;
        
        Function<String, String> abc ;

    }
}
