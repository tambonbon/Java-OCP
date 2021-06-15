package Enthuware._02JavaOOP.fieldsMethods;

public class SetFinalField {
    static class Triangle {
        public int base;
        public int height;
        private final double ANGLE; // this is final
        /* 
        Since ANGLE is final, it MUST be explicitly initialized ..
        .. by the time the creation of an object of the class is complete 
        Either:
        1. private final double ANGLE = 0;
        2. initialize in constructor or instance block
        */
        
        public void setAngle(double a) { ANGLE = a; }
        /* 
        Since ANGLE is final,
        you CANT change its value once it is set
        (Even this method NOT compile although ANGLE has not been initialized)
         */
        public static void main(String[] args) {
            
        }
    }
}
