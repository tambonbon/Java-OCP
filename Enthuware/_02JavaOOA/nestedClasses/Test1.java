package Enthuware._02JavaOOA.nestedClasses;

import java.util.Collection;

import Enthuware._02JavaOOA.nestedClasses.Outsider.InsiderStatic;

class Outsider {
    public class Insider {
        static void test() { } // WRONG, a static method inside non-static inner class
     }
    public static class InsiderStatic {
        void test() { }
        static void testStatic() { }
     }
}

public class Test1 {
    public static void main(String[] args) {
        var out = new Outsider();
        Outsider.Insider insider = out.new Insider(); // RIGHT
        Insider insider2         = out.new Insider(); // WRONG, bc Insider is not static
        // only after importing it will compile
        InsiderStatic insider3   = out.new InsiderStatic(); // RIGHT, bc InsiderStatic
    }
}
