package Enthuware._02JavaOOP.interfaces;

public class ValidMethodsInAbstractClass {

    // VALID abstract class:
    static abstract class Auto1 {
        void honk() { };
    }
    static abstract class Auto2 {
        abstract void honk();
    }

    // INVALID :
    static abstract class Auto3 {
        void honk() ; // contrast to Auto1
    }
}
