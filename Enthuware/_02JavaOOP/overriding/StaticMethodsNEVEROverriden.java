package Enthuware._02JavaOOP.overriding;

public class StaticMethodsNEVEROverriden {
    static class A {
        public static void sM1() {
            System.out.println("In base static");
        }
    }

    static class B extends A {
        public static void sM1() { 
            // NOT overriden, but just HIDE sM1() of A...
            System.out.println("In sub static");
        }
    }

    public static void main(String[] args) {
        A a = new B();
        a.sM1();
        
    }
}
