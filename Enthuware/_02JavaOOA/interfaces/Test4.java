package Enthuware._02JavaOOA.interfaces;

public class Test4 {
    interface I {}
    class A implements I { }
    class B extends A { }
    class C extends B { }

    public static void main(String[] args) {
        A a = new Test4().new A();
        B b = new Test4().new B();

        a = b; 
        a = (B)(I) b;
        // class B DOES implement I,
        // a reference of type I can be cast to any class at compile time..
        // .. (except if the class is final && NOT implement I)
        // Since B is-a A ---> b can be assigned to a

        b = (B)(I) a; // Fail at RT as a NOT point to an object of class B

        // a = (I) b; // CANT convert from I to A bc I is not an A

        I i = (C) a; // compile bc C is-a A, which in turn is-a I, and reference of class A can 
        // .. point to object of class C
        // BUT fail at RT bc a NOT point to an object of class C
    }
}
