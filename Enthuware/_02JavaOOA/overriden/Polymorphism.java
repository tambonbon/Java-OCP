package Enthuware._02JavaOOA.overriden;

public class Polymorphism {
    static class Base {
        void methodA() {
            System.out.println("base - MethodA");
        }
    }

    static class Sub extends Base {
        public void methodA() {
            System.out.println("sub - MethodA");
        }
        
        public void methodB() {
            System.out.println("sub - MethodB");
        }

        public static void main(String[] args) {
            Base base = new Sub() ;
            base.methodA(); // sub - methodA
            // base.methodB(); // methodB is UNDEFINED in Base
            // base is declared to be a reference of class Base,
            // and methodB is NOT defined in Base
        }
    }
}
