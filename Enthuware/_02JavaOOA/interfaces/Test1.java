package Enthuware._02JavaOOA.interfaces;

public class Test1 {
    interface Measurement {
        public static int getBreadth() {return 0;}
        // interface can implement static method

        public default int getLength() {return 10;}
        // public default final int getLength1() {return 10;}
    }
}
