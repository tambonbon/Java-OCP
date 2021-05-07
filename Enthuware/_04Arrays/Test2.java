package Enthuware._04Arrays;

public class Test2 { // 1244
    public static void main(String[] args) {
        A[] a, a1;
        B[] b;
        
        a = new A[10];
        a1 = new A[10];

        b = new B[20];
        
        a = b;
        // b = a; // mismatch, you can only do subclass in rhs
        System.out.println(b.getClass());
        b = (B[]) a;
        // cast is needed as superclass is rhs
        System.out.println(b.getClass());
        b = (B[]) a1; // WHY classcastexception?
    }
}

class A { }
class B extends A { }