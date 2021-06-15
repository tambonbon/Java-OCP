package Enthuware._02JavaOOP.overriding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class OverrideGenerics3 {
    class Base {
        public <T> Collection<T> transform(Collection<T> list) {
            return new ArrayList<>();
        }
    }

    class Derived extends Base {
        // public <T> Collection<T> transform(Collection<T> list) {
        //     return new HashSet<String>(); // Invalid, CANT convert from HashSet<String> to Collection<T>
        // } // Because, what if while invoking the method, T is typed to Integer like this:
        /* 
        Derived d = new Derived();
        List<Integer> list = new ArrayList<Integer>()
        Collection<Integer> c = d.transform(list)
         */
        // In short, if method signature is T, but return something more specific ---> invalid
        
        public <T> Collection<T> transform(Stream<T> list) {
            return new HashSet<>();  // this is an overload method
        }

        public <T> List<T> transform(Collection<T> list) {
            return new ArrayList<T>(); // valid override
        } // List<T> is a sub-type of Collection<T>

        public <X> Collection<X> transform(Collection<X> list) {
            return new HashSet<X>(); // valid override
        } 

        public Collection<CharSequence> transform(Collection<CharSequence> list) {
            return new HashSet<CharSequence>(); // neither overload nor override
        }

        // public <T> Collection<T> transform(Collection<T> list) {
        //     return new HashSet<T>(); // neither overload nor override
        // } // this worksv

        /* 
        ArrayList<CharSequence> is covariant with List<? extends CharSequence>
         */
    }
}
