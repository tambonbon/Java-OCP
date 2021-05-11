package Enthuware._02JavaOOA.overriden;

public class Override4 {
    class A {
        public void m1() { System.out.println("From A"); }
    }
    class B extends A {
        public void m1() { System.out.println("From B");}
    }
    
    class C extends B {
        public void m1() {
            // to access class B's m1():
            // super.m1();
            // or another way (polymorphism):
            // B object1 = new B();
            // A object2 = (A) object1;
            // object2.m1();
        
            // to access class A's m1():
            A object = new A();
            object.m1();

            // you cannot access A from class C for the same object (i.e. this) !!!
        }
    }

    public static void main(String[] args) {
        new Override4().new C().m1();
    }
}
