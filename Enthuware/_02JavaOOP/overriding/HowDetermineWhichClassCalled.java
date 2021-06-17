package Enthuware._02JavaOOP.overriding;

public class HowDetermineWhichClassCalled {
    /**
     * Polymorphism means that, it is always the class of the object 
     *  (and not the class of reference variable that a variable points to)
     * that determines which method will be called at Runtime
     
     * The concept of polymorphism NOT applied to fields, private and static methods
     */
    static interface I { }
    
    static class A implements I { 
        @Override
        public String toString() {
            return "in a";
        }
    }

    static class B extends A { 
        @Override
        public String toString() {
            return "in b";
        }
    }

    public static void main(String[] args) {
        B b = new B();
        A a = b;
        I i = a;
        // note that, only ONE object is created, which is B()
        // ---> B's toString will be called NO MATTER WHAT REFERENCE YOU USE

        System.out.println(i); // in b
        System.out.println(a); // in b
        System.out.println(b); // in b

        A a1 = new A();
        I i1 = new A();
        
        System.out.println(i1); // in a
    }
}
