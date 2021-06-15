package Enthuware._02JavaOOP.nestedClasses;

public class Outer1 {
    private void Outer1() { } // WARNING, NOT ERROR !
    protected class Inner {
        // Constructor for Inner is protected !
        // the default constructor of inner class has access modifier...
        // .. the SAME as that of the class
     }

}
