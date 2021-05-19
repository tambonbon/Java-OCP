package Enthuware._02JavaOOA.instantiate;

public class ObjectInitialization {
    final int value;
    // If we don't initialize value before the creation of the class ---> NOT COMPILE

    public ObjectInitialization() {
        value = 10;
        // this("10");N // or this, still okay
    }
    public ObjectInitialization(String x) {
        value = Integer.parseInt(x, 2);
    }
    public ObjectInitialization(int x) {
        value = x;
    }

    /* Invalid declarations: */
    public void ObjectInitialization(int x) {
        value = x; // CAN'T assign a value to a final instance variable in a method
    }
}
