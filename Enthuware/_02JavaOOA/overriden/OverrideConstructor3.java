package Enthuware._02JavaOOA.overriden;

public class OverrideConstructor3 {
    /** Remember:
     * Before the fields of a subclass can be initialized by a constructor...
     * ... the fields of superclass HAVE to be initialized
     * ----> superclass's constructor MUST first execute before a subclass's constructor
     * this goes up the chain to Object
     */
    static class X {
        public X() {
            System.out.println("In X");
        }
    }

    static class Y extends X {
        public Y() {
            super(); // not required..
            // .. because auto added if either:
            // 1. you dont explicitly call any superclass constructor
            // 2. another constructor of same class
            System.out.println("In Y");
        }
    }

    static class Z extends Y {
        public Z() {
            System.out.println("In Z");
        }
    }

    public static void main(String[] args) {
        Y y = new Z(); // In X In Y In Z

        Z z = new Z(); // In X Y Z

        X x = new Y(); // In X Y

        X x2 = new Z(); // In X Y Z
    }
}
