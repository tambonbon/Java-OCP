package Enthuware._02JavaOOP.overriding;

public class Test1 {
    class TestInAnotherPackage {
        void sup() { }
    }

    class Sup { 
        public void tres() { }
    }

    class Base extends Sup {
        @Override
        public void tres() {
            // TODO Auto-generated method stub
            super.tres();
        }
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Sup sup = test1.new Sup();
        Base base = test1.new Base();

        sup = (Sup) base;

        base = (Base) sup;
        
        
    }
}
