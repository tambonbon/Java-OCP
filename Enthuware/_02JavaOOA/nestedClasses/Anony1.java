package Enthuware._02JavaOOA.nestedClasses;

public class Anony1 {
    public Inner inner1 = new Inner() {
        // anonymous class
        public void doA() {
            System.out.println("doing A");
        }
    };

    public void doA() {
        inner1.doA();
        // NO WAY doA() in inner1 can be access !!!!!
    }
}

class Inner {
    int value;
}