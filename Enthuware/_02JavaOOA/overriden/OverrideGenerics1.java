package Enthuware._02JavaOOA.overriden;

import java.util.ArrayList;
import java.util.Set;

public class OverrideGenerics1 {
    static class Base { 
        public ArrayList<Number> transform(Set<Integer> list) { return null; }
    }

    static class Derived extends Base {
        @Override
        public ArrayList<Number> transform(Set list) { // if overriding method NOT use generic for params --> VALID..
            //.. the reverse, is NOT valid
            // For example, param type of Set in an overriding method matches with param type of Set<Integer>..
            // .. of overridden method, but param type of Set<Integer> in an overriding method ..
            // .. will NOT match Set in overriden method

            // In other words, a subclass method is allowed to erase generic type OF A PARAMETER
            // or, overriding is allowed to erase generic type, but NOt allowed to add generic if overriden NOT have it
            // If both methods have generic type --> they MUST match EXACTLY
            // e.g., overidden has Set<Integer> ---> overriding has Set or Set<Integer>

            // CHECK FOR RETURN TYPE. Must be covariant returns for overidden
            // ArrayList<? super Integer> or ArrayList<? extends Integer> NOT sub-type of ArrayList<Number>
            return null;
        }
    }
}
