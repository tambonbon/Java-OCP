package Enthuware._04Arrays;

public class Test2 { // 1244
    public static void main(String[] args) {
        // A[] a, a1;
        // B[] b;
        
        A[] a = new A[1];
        a[0] = new A();

        A[] a1 = new A[1];
        a1[0] = new A();
        
        B[] b = new B[1]; // if change B[] to A[] --> NO compile error
        b[0] = new B();
        // a = b; // its good
        // b = a; // invalid, mismatch, you can only do subclass in rhs

        a = (A[]) b; // promoting should work
        b = (B[]) a; // ClassCastException
        // cast is needed as superclass is rhs

        b = (B[]) a1; // WHY classcastexception?
    }
}

class A { }
class B extends A { }