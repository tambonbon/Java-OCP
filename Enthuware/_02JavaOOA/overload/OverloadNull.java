package Enthuware._02JavaOOA.overload;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverloadNull {
    public void method(Object o) {
        System.out.println("object version");
    }

    public void method(FileNotFoundException fileNotFoundException) {
        System.out.println("FNFE version");
    }

    public void method(IOException ioException) {
        System.out.println("IOException version");
    }

    public static void main(String[] args) {
        OverloadNull overloadNull = new OverloadNull();
        overloadNull.method(null);
        // FNFE version
        // because with overloadding, the most specific method will be called
        // here, Object <- IOException <- FileNotFound..
        // .. and null can be called in all 3 methods
        // ----> FileNotFound is called

        // REMARKS: if there are 2 overloaded methods with String and StringBuilder..
        // .. ---> NOT COMPILE 
    }
}
