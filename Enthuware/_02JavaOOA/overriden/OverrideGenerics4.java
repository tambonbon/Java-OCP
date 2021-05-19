package Enthuware._02JavaOOA.overriden;

import java.util.ArrayList;
import java.util.List;

public class OverrideGenerics4 {
    static class A {
        public List<? super Integer> getList() {
            return null;
        }
    }


    static class B extends A {
        @Override
        public List<? super Number> getList() { // List<? super Number> is sub-type of List<? super Integer>
            return null;
        }
    }

    class C extends A {
        @Override
        public ArrayList<Number> getList() { 
            // Since A<T> is-a A<? super T>,  while S is-a T ...
            // .. and A<? super T> is-a A<? super S>
            // ----> A<T> is-a A<? super S>
            
            // List<Number> is-a List<? super Number>, ..
            // .. Integer is-a Number ..
            // .. List<? super Number> is-a List<? super Integer> .. 
            //  ---> List<Number> is-a List<? super Integer>
            return null;
        }
    }
}
