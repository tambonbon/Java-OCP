package Enthuware._02JavaOOA.overriden;

public class CastClass3 {
    interface I { }
    static class A implements I { }
    static class B extends A { }
    static class C extends B {} 

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        b = (B)(I) a;
    }
}
