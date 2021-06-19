package Enthuware._02JavaOOP.enumerations;

import java.io.Serializable;

public class InvalidEnum {

    static interface I {}

    public enum EnumA implements I, Serializable { A, AA } // enum is allowed to implement interfaces

    static class TestClass {
        // public enum EnumB{
        //     B, BB, BBB;
        //     public Object clone() {
        //         return B; // invalid, Enum makes clone method final --> CANT override
        //     }
        // }

        public static enum EnumC{ C, CC, CCC }

        // public static enum EnumD extends EnumC { DDD } // invalid, CANT extend any other enum/class

        public enum EnumE { E, EE } // nonstatic still valid 

        public TestClass() {
            System.out.println(EnumC.C.ordinal()); // invalid, `ordinal()` instead of `index()`
            // return 0 in this case (start at 0)
        }

        public static void main(String[] args) {
            System.out.println(EnumC.valueOf("ccc")); // runtime error
            System.out.println(EnumC.CCC.name()); // print CCC
        }
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
    }
}
