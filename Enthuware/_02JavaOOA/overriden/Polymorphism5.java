package Enthuware._02JavaOOA.overriden;

public class Polymorphism5 {
    static class Base {
        public void eat() { System.out.println("In Base");}
    }

    static class Derive extends Base {
        public void eat() { System.out.println("In Derive");}
    }

    static class Child extends Derive {
        public static void main(String[] args) {
            Child child = new Child();
            child.eat(); // in derive

            Base base = new Child();
            base.eat(); // in derive
        }
    }
}
