package Enthuware._02JavaOOA.overriden;

public class CastClass3 {
    interface I { }
    static class A implements I { }
    static class B extends A { }
    static class C extends B {} 

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(b instanceof A); // true
        System.out.println(a instanceof B); // false

        /* Run fine: */
        a =  b; // b is upcast to a
        a = (B) b; // B is-a A
        a = (A) b; //  b is explicitly upcasted
        a = (B)(I)b;
        // a = (A)(I)b;
        
        /* Runtime exception */
        b = (B)(I) a;
        // because a NOT point to an object of class B
        // The following would be fine:
        /* 
        A aPointB = new B();
        b = (B)(I) aPointB;
         */

        I i = (C) a;
        // C is-a A, which is-a I, but not run because a NOT point to object of class C
        // The following would be fine:
        
        /*
        I iPointC = new C();
        i = (C) iPointC;
        i = iPointC;
         */

         /* Compile error */
        // a = (I) b; 
        // an I is not an A

        // b = a;
    }
}
