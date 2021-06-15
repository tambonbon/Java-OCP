package Enthuware._02JavaOOP.overriding;

public class Polymorphism1 {
    static class A {
        A() { print(); }
        void print() { System.out.println("A ");}
    }

    static class B extends A {
        int i = 4;
        void print() {
            System.out.println(i + " ");
        }
        public static void main(String[] args) {
            A a = new B();
            // When an object of class B is created 
            // ---> 1st, the constructor of B is called
            // here, it is implicitly called to super(), which invokes A's constructor
            // A's constructor in turn call print()
            // !!!! NOTICE THIS: !!!!
            // since `print` is non-private -> polymorphic
            // ----> the selection of the method to be executed depends on the class of actual object on which it is invoked <----
            // here, a is of class B ----> B's print is selected instead of A's print, calling i
            // HOWEVER !!!!!!
            // at this point,
            // i has NOT been initialized !!! 
            // because we are still in the middle of initializing A
            // -----> so its default value 0 is printed
            a.print(); // 0 4

            // Had i been static or final ---> 4 4 

            A a2 = new A();
            a2.print(); // A A 
        }
    }
}
