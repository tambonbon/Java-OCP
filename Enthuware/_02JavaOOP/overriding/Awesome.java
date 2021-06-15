package Enthuware._02JavaOOP.overriding;

public class Awesome extends AmazingClass implements AmazingInterface{
    // 3153
    @Override
    public void amazingMethod(String arg1) { }
    
    @Override
    public void amazingMethod(String arg1, String arg2) { }

    public static void main(String[] args) {
        AmazingInterface amazingInterface = new Awesome();
        Awesome awesome = new Awesome();

        // valid codes:
        amazingInterface.amazingMethod(AmazingInterface.value); // field in static is public, static, final
        amazingInterface.amazingMethod(AmazingClass.value);

        awesome.amazingMethod(AmazingClass.value, AmazingInterface.value);

        // Invalid codes:
        // amazingInterface.amazingMethod(value); // ambiguous

        // amazingInterface.amazingMethod(AmazingInterface.value, AmazingClass.value); 
        // // amazingInterface is reference of type AmazingInterface, which NOT have amazingMethod w/ 2 params
        // // in other words, amazingMethod(agr1, arg2) is HIDDEN from amazingInterface object
        
        // ((AmazingClass)amazingInterface).amazingMethod("x1", value); // ambiguous
        
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
