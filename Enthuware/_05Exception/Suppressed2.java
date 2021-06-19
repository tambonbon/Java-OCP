package Enthuware._05Exception;

import java.io.IOException;

public class Suppressed2 implements AutoCloseable {
    String header = null;
    public void open() throws IOException {
        header = "OPENED";
        System.out.println("Device Opened");
        throw new IOException();
    } 

    @Override
    public void close() throws IOException {
        System.out.println("Closing device");
        header = null;
        throw new RuntimeException("rte");
    }

    public static void main(String[] args) throws Exception {
        try (Suppressed2 dSuppressed2 = new Suppressed2()) {
            throw new Exception("test");
            // This time, creating d2 is fine, but closing it throws Exception
            // ---> try block is still executed
            // exceptions while closing is added to suppressed
        }
        /* Results:
        Closing device
        Exception in thread "main" java.lang.Exception: test
        at Suppressed2.main(Suppressed2.java:20)
        Suppressed: java.lang.RuntimeException: rte
                at Suppressed2.close(Suppressed2.java:15)
                at Suppressed2.main(Suppressed2.java:21)
                 */
    }
}
