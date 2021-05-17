package Enthuware._02JavaOOA.overriden;

public class OverrideConstructor2 {

    static class Doll {
        String name;
        // class Doll explicitly defines an args-constructor 
        // ---> NOT auto insert no-arg constructor ...
        Doll(String name) {
            this.name = name;
        }
        Doll(String name, Long price) {
            this.name = name;
        }
    }
    
    static class Barbie extends Doll {
        // .. ----> each of Barbie constructor MUST directly or indirectly ...
        // ... call Doll's arg-constructor
        Barbie() {
            this("unknown"); // or super("unknown") is still fine
            
            /** INVALID constructors:
             * 1. super(), as Doll NOT have no-args constr.
             * 2. Doll(), as invalid syntax
             * 3. this(), as recursive constr.
             */
        }

        Barbie(String name){
            super(name);
        }
    }
}
