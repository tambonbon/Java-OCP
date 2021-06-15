package Enthuware._02JavaOOP.overriding;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TypeErasure1 {
    // 3092

    /**
     * Example of type erasure
     */
    public List<CharSequence> transform(Set<CharSequence> list) { return null; }
    // public List<CharSequence> transform(Set<String> list) { return null; }

    public static void main(String[] args) {
        
    }
}

class TypeErasureSub extends TypeErasure1 {
    /**
     * Type erasure in inheritance
      */
    @Override
    public List<CharSequence> transform(Set<String> list) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Type incompability (List<String> != List<CharSequence>)  */
    @Override
    public List<String> transform(Set<CharSequence> list) {
        return null;
    }

    /** 
     * Covariant returns ---> Valid (ArrayList is sub-type of List)
      */
      @Override
      public ArrayList<CharSequence> transform(Set<CharSequence> list) { // parameter must be Set<CharSequence> or Set
          return null;
      }

      /**
       * Overload method -> valid
       *  */
      public List<Integer> transform(TreeSet<CharSequence> list) {
          return null;
      }

        /**
         * Hierachy 1: A<S> <<<A? extends S> <<< A<? extends T>
         * Since Integer is sub-type of Number, List<Integer> is sub-type of List<? extends Integer>
         * List<? extends Integer> is sub-type of List<? extends Number>
         * ----> if an overridden method returns List<? extends Integer>,...
         * ... the overriding method can return List<Integer> but NOT List<Number> or List<? extends Number> <----
        */

        /**
         * Hierachy 2: A<T> <<<A<? super T> <<< A<? super S>
         * Since List<Number> is sub-type of List<? super Number>,
         * and List<? super Number> sub-type of List<? super Integer>
         * ----> if an overridden method returns List<? super Number> ...
         * ... the overriding method can return List<Number> but NOT List<Integer> or List<? super Integer>
             */


        // remarks: if an overriden method returns List<? extends Number>...
        // ... overriding method can rerutn List<Number>, List<Integer> but NOT List<Object> or List<? extends Objects>

        // remarks: List<? super Object> is sub-type of List<? super CharSequence>
}