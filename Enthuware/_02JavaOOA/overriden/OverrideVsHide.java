package Enthuware._02JavaOOA.overriden;

public class OverrideVsHide {
    
    static class Animal {
        
        public static void testClassMethod() {
            System.out.println("Static method in Animal");
        }

        public void testInstanceMethod() {
            System.out.println("Instance method in Animal");
        }

        public static void testClassMethodNotInChild() {
            System.out.println("Static method in Animal but not in Cat");
        }
    }

    static class Cat extends Animal {

        public static void testClassMethod() {
            System.out.println("Static method in Cat");
        }

        @Override
        public void testInstanceMethod() { // this CANT be static, as static CANT hide instance
            System.out.println("Instance method in Cat");
        }
    }

    public static void main(String[] args) {

        Animal.testClassMethod(); // Static method in Animal
        Cat.testClassMethod(); // Static method in Cat (makes sense)
        Cat.testClassMethodNotInChild(); // Static method in Animal but not in Cat

        myAnimal.testClassMethod(); // Static method in Animal
        myAnimal.testInstanceMethod(); // Instance method in Cat
        
    }
}
