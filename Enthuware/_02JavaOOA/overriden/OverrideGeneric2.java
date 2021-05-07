package Enthuware._02JavaOOA.overriden;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class OverrideGeneric2 {
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

        public <T extends CharSequence> Collection<T> tranform(List<T> list) {
            return null; // Collection<T> valid sub-type of Collection<String>
            // params: List<T> valid Collection<T>
        }
    }
}
