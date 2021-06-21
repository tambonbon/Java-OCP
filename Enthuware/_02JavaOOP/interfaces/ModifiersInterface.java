package Enthuware._02JavaOOP.interfaces;

public class ModifiersInterface {
    static interface Measurement {
        public static int getBreadth() {return 0;}
        // interface can implement static method

        public default int getLength() {return 10;}
        public default final int getLength1() {return 10;} // INVALID, CANT be final

        void moo();
    }

    static interface MeasurementChild extends Measurement {
        private void foo() { }; // interface is allowed to have private methods..
        // .. and this method requires a body !!!

        // INVALID methods:
        protected void moo(); // CANT be protected !!! either public or private
        
    }
}
