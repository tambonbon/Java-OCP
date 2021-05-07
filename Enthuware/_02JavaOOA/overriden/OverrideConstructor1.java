package Enthuware._02JavaOOA.overriden;

public class OverrideConstructor1 {
    static class A {
        protected int i ;
        A(int i) { this.i = i; }
        // A() { }
    }

    static class B { }

    static class B1 extends A { 
        // if superclass has no non-args constructor..
        // and subclass has no constructor ---> invalid\
        // B1(int i) { super(i);} // or this constructor is needed
    }

    static class B2 extends A {
        B2 () { } // not valid either
    }

    static class B3 {
        B3() { }
    }
}
