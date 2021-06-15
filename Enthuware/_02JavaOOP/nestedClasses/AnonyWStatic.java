package Enthuware._02JavaOOP.nestedClasses;

abstract class Anony {
    public abstract void m1();
}

// An anonymous class CAN be declared in static method
public class AnonyWStatic {
    public static Anony getAnony () { // NOTE: static !!!  
        return new Anony(){ // This declares as well as instantiates an anonymous class...
                            // ... extending Anony
            public void m1() { }
        };
    }   
}
