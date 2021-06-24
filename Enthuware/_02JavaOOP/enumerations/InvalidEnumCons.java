package Enthuware._02JavaOOP.enumerations;

public enum EnumA { A, AA }; // invalid, must be in its own file

public class InvalidEnumCons {
    public enum EnumB { B, BB }; // ok

    public InvalidEnumCons() {
        enum enumD{ D, DD}; // invalid, enum CANT be in constructor
    }

    public void name() {
        enum enumE{ E, EE}; // invalid, enum CANT be inside method
    }
}
