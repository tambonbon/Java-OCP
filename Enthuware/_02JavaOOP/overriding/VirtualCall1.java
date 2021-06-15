package Enthuware._02JavaOOP.overriding;

public class VirtualCall1 { // 1215
    static class A {
        public void mA() {
        }
    }

    static class B extends A{
        public void mA() { }
        public void mB() { }
    }

    static class C extends B {
        public void mC() { }
    }

    public static void main(String[] args) {
        A x = new B(); // x is of class A, which NOT contain mB. Though the object referred to by x is of class B
        System.out.println(x.getClass().toString()); // class B ?
        B y = new B();
        B z = new C();

        // Virtual call
        // A virtual call means the call is bound to a method at RunTime and not at Compile Time
        // All non-private && non-final instance method calls ---> virtual

        // Valid calls:
        x.mA();
        y.mA();
        y.mB();
        z.mA();
        z.mB();

        // Invalid calls:
        x.mC();
        z.mC();
    }
}
