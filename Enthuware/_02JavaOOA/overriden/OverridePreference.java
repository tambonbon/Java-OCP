package Enthuware._02JavaOOA.overriden;

public class OverridePreference {
    /* 
    Instance methods are preferred over interface default methods
     */
    static class Horse {
        public String identifyMyself() {
            return "I am a horse";
        }        
    }

    static interface Flyer {
        default public String identifyMyself() {
            return "I am able to fly";
        }
    }

    static interface Mythical {
        default public String identifyMyself() {
            return "I am a mythical creature";
        }
    }

    static class Pegasus extends Horse implements Flyer, Mythical {
        public static void main(String[] args) {
            Pegasus pegasus = new Pegasus();
            System.out.println(pegasus.identifyMyself()); // I am a horse
        }
    }

    /* 
    Methods that are already overridden by other candidates are ignored
     */

     static interface Animal {
         default public String identifyMyself() {
             return "I am an animal";
         }
     }

     static interface EggLayer extends Animal {
         default public String identifyMyself() {
             return "I am able to lay egg";
         }
     }

     static interface FireBreather extends Animal {
         public String identifyMyself();
     }

     static class Reptile implements Animal, FireBreather {
        public String identifyMyself() {
            return "I am able to crawl";
        }
     }

     static class Dragon extends Reptile implements Animal, EggLayer {
         public static void main(String[] args) {
             Dragon dragon = new Dragon();
             System.out.println(dragon.identifyMyself()); // I am able to lay egg
             // even it's referring to Animal.identifyMyself...
             // .. EggLayer.identifyMyself is overriding Animal.identifyMyself ---> EggLayer method is called

             FireBreather fireBreather = new Dragon();
             fireBreather.identifyMyself();

             Animal reptile = new Reptile();
             reptile.identifyMyself();
         }
     }
}
