package Chapter14.generics.boundedGeneric.lowerBounded;

import java.util.ArrayList;
import java.util.List;

public class LowerBounded {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("tweet")    ;

        List<Object> objects = new ArrayList<>();
        addSound4(strings);
        addSound4(objects);
        System.out.println(strings);
    }

    public static void addSound(List<?> list) {
        // list.add("quack"); // NOT COMPILE
    }

    public static void addSound2(List<? extends Object> list) {
        // list.add("quack"); // NOT COMPILE
    }

    public static void addSound3(List<Object> list) {
        // list.add("quack"); // NOT COMPILE
    }


    public static void addSound4(List<? super String> list) {
        list.add("quack"); // NOT COMPILE
    }
    /*
    * With lower bound, the list will be a list of String,
    * or a list of some objects that are a superclass of String */
}
