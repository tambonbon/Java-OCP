package Enthuware._02JavaOOP.overriding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class OverrideGenerics2 {
    static class Base {
        public <T extends CharSequence> Collection<String> transform(Collection<T> list) {
            return new ArrayList<String>();
        } 
    }

    static class Derived extends Base {
        // public Collection<String> transform(Collection<T> list) {
        //     return new HashSet<String>();
        // } // not compatible

        // public <T extends String> Collection<T> transform(Collection<T> list) {
        //     return new HashSet<T>();
        // } // invalid

        // public <T extends CharSequence> List<T> tranform(Collection<T> list) {
        //     return ArrayList<T>();
        // } // bad return type, List<T> NOT valid sub-type of Collection<String>

        public <T extends CharSequence> Collection<T> tranform(List<T> list) { // this is overload
            return null; // Collection<T> valid sub-type of Collection<String>
            // params: List<T> valid Collection<T>
        }
    }

    // Another example of different param list: ---> THIS IS OVERLOAD !
    static class Animal {
        public <T extends CharSequence> Set<String> transform(Set<T> set) { return null; }
    }

    static class Cat extends Animal {
        // @Override // WRONG
        public <T extends CharSequence> Set<T> transform(TreeSet<T> set) {
            return null;
        }
    }
}
