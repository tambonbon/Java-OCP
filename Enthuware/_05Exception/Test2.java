package Enthuware._05Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException{
        try {
            if (args.length == 0) m2();
            else m3();
            // even though we assume Test2 ALWAYS take at least 1 argument,
            // we need to also handle exception for m2
        }
        // catch (IOException | IndexOutOfBoundsException exception) { // Exception params in multi-catch is implicitly final
            
        // }

        catch (IOException ioException) {

        }
         System.out.println("Can this be printed after catch cluase?");
         m2();
         System.out.println("Can this be printed after a method throwing exception?");
    }

    public static void m2() throws IOException {
        throw new FileNotFoundException();
    }

    public static void m3() throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException();
    }
}
