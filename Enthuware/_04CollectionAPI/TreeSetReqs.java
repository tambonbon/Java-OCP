package Enthuware._04CollectionAPI;

import java.util.TreeSet;

public class TreeSetReqs {
    
    static class Person {
        private static int count  = 0;
        private String id = "0"; 
        private String interest;

        public Person(String interest) { this.interest = interest; this.id = "" + ++count; }
        public String getInterest() {
            return interest;
        }
        public void setInterest(String interest) {
            this.interest = interest;
        }
        @Override
        public String toString() {
            return id;
        }
    }

    static class StudyGroup {
        String name = "MATH";

        TreeSet<Person> set = new TreeSet<Person>(); // <---- Note this TreeSet

        void add (Person p) { if (name.equals(p.getInterest())) set.add(p); }
    }

    public static void main(String[] args) {
        StudyGroup mathGroup = new StudyGroup();
        mathGroup.add(new Person("MATH"));
        System.out.println(mathGroup.set); // ----> Throws ClassCast Exception !!!! <----
    }

    /**
     * The foremost requirements of a TreeSet:
     * 1. Either Elements MUST 
     *      a. implement Comparable (which ha compareTo(Object))
     *      b. and be mutually comparable
     * 2. Or TreeSet MUST be created with by passing a Comparator(which has compare(Object,Object))
     * 
     * In above example: compiler knows nothing about this requirement --> compiles fine without warning
     */
}
