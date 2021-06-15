package Enthuware._02JavaOOP.interfaces;

public class FieldInInterface {
    static interface Bozo {
        int type = 0; // public, static, final
    }

    static class Type1Bozo implements Bozo { 
        public Type1Bozo() {
            type = 1; // CANNOT be assigned
        }
    }
}
