package Enthuware._02JavaOOP.interfaces;

public class Sample implements IInt {
    public static void main(String[] args) {
        Sample s = new Sample();
        int j = s.theValue;
        int k = IInt.theValue; // because all fields in interface are public, static and final !
        int l = theValue; // all class implementing IInt gets this fields
    }
}

interface IInt {
    int theValue = 0;
}