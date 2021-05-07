package Enthuware._02JavaOOA.overriden;

public class Awesome extends AmazingClass implements AmazingInterface{
    // 3153
    public void amazingMethod(String arg1) { }
    public void amazingMethod(String arg1, String arg2) { }

    public static void main(String[] args) {
        AmazingInterface amazingInterface = new Awesome();

        // Invalid codes:
        amazingInterface.amazingMethod(value); // ambiguous
        amazingInterface.amazingMethod(AmazingInterface.value, AmazingClass.value); 
        // amazingInterface is reference of type AmazingInterface, which NOT have amazingMethod w/ 2 params
        ((AmazingClass)amazingInterface).amazingMethod("x1", value); // ambiguous
        
    }
}

interface AmazingInterface {
    String value = "amazing";
    void amazingMethod(String arg);
}

abstract class AmazingClass implements AmazingInterface {
    static String value = "awesome";
    abstract void amazingMethod(String arg1, String arg2);
}
