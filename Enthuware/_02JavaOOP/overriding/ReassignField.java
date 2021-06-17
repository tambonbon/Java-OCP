package Enthuware._02JavaOOP.overriding;

public class ReassignField {
    
    // first, we have a field in an interface
    interface FieldInInterface {
        int type = 0; // PUBLIC, STATIC, FINAL !!!
        public void jump();
    }

    static class DerivedFromInterface implements FieldInInterface {
        public DerivedFromInterface() {
            type = 1; // invalid, you CANT re-assign field from interface
        }
        @Override
        public void jump() {
            System.out.println("jumping..." + type);
        }
    }

    // second, we have a field in an abstract class
    static abstract class FieldInAbstractClass {
        int type = 0;
        public abstract void jump();
    }

    static class DerivedFromAbstractClass extends FieldInAbstractClass {
        public DerivedFromAbstractClass() {
            type = 1; // valid
        }               
        @Override
        public void jump() {
        }
    }
}
