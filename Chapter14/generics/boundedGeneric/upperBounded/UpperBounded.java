package Chapter14.generics.boundedGeneric.upperBounded;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBounded {
    // ArrayList<Number> list = new ArrayList<Integer>(); // NOT Compile
    // ArrayList<Integer> list = new ArrayList<Number>(); // NOT Compile
    List<? extends Number> list = new ArrayList<Integer>();
    // Any class extending Numbers or Numbers itself can be used !

    static class Sparrow extends Bird {}
    static class Bird {}

    public static void main(String[] args) {
        List<? extends Bird> birds = new ArrayList<Bird>(); // immutable
        List<? extends Bird> lBirds= List.of(new Bird(), new Bird()); // immutable
        // lBirds.add(new Bird());

        Goose goose = new UpperBounded().new Goose();
        
        UpperBounded upperBounded = new UpperBounded();
        upperBounded.anyFlyer(new ArrayList<Flyer>());
        // upperBounded.anyFlyer(new ArrayList<Goose>()); // NOT compile
        upperBounded.groupOfFlyers(new ArrayList<Flyer>());
        upperBounded.groupOfFlyers(new ArrayList<Goose>()); 
        /* 
        * ---> ONLY GOOSE CAN FLY TOGETHER
        * */
    }

    /**
     * Flyer
     */ 
    public interface Flyer {
        void fly(); 
    }
    /**
     * HangGlider
     */
    public class HangGlider implements Flyer {
        @Override
        public void fly() {
            
        }
    }
    /**
     * Goose implements Flyer
     */
    public class Goose implements Flyer {
    
        @Override
        public void fly() {
            
        }
    }

    private void anyFlyer(List<Flyer> flyers) { }

    private void groupOfFlyers(List<? extends Flyer> flyers) { }
}
