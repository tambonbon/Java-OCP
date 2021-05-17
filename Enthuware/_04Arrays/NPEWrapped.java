package Enthuware._04Arrays;

import java.io.IOException;

public class NPEWrapped {
    static class AX {
        static int[] x = new int[0]; // an array of size 0
        static {
            x[0] = 10;
            // throw new IOException(); // Invalid
        }
        int y;
        {
            y = 0;
            try{
                throw new IOException(); // 1.
            } catch(RuntimeException exception) { System.out.println();}
        }

        public AX() throws IOException { } // 2. 
        // all constructor has to declare the same exception thrown in initializer block at 1
        public static void main(String[] args) throws IOException{
            var ax = new AX(); 
            /* 
            Exception in thread "main" java.lang.ExceptionInInitializerError
            Caused by: java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
            at Enthuware._04Arrays.NPEWrapped$AX.<clinit>(NPEWrapped.java:7)
             */

             /* 
             1. Any exception thrown in a static block is wrapped into ExceptionInInitializerError 
             2. If you try to throw a checked exception from a static block to outside --> code NOT compile 
             3. An instance block is allowed to throw a checked exception ..
             .. but only if that exception is declared in the throws clause in all constructors of the class*/
             
        }
    }
}
