package Enthuware._02JavaOOP.interfaces;

public class FieldBothClassInterf {
    
    static interface Eatable {
        int types = 10; // CANT re-assign this !
    }
    
    static class Food implements Eatable {
        int types = 20;
    }

    static class Fruit extends Food implements Eatable {
        public static void main(String[] args) {
            // CANT sysout types
            
            // If you want to re-assign types --> this the way:
            Food food = new Food();
            food.types = 30;

            types = 30; // invalid
            System.out.println(types); // invalid
        }
    }
}
