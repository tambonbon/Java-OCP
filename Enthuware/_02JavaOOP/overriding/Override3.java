package Enthuware._02JavaOOP.overriding;

public class Override3 {
    static class A {
        public void m1(){}
    }

    static class B1 extends A{}
    static class B2 extends A {
        public void m1() { }
    }

    class C1 extends B1 { }
    class C2 extends B1 { 
        public void m1() { }
    }
     
    public static void main(String[] args) {
        B1 b1 = new B1();
        b1.m1(); // A.m1() will be called

        C2 c2 = new C2();
        c2.m1();

        C1 c1 = new C1();
        c1.m1(); // A.m1() will be called
    }
}
