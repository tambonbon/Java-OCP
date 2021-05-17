package Enthuware._05Exception;

import java.io.IOException;

public class Test4 implements AutoCloseable{
    String header = null;
    public void open() {
        header = "OPENED";
        System.out.println("Device opened");
    }
    public void write(String string) throws IOException {
        System.out.println("Writing: " + string);   
    }
    public void close() {
        header = null;
        System.out.println("Device closed");
    }
    public static void test() {
        Test4 dTest4 = new Test4();
        try (dTest4) {
            dTest4.open();
            dTest4.write("hi");
            dTest4.close();
        } catch (IOException exception) {
            System.out.println("Got exception");
        }

        
    }
    public static void main(String[] args) {
        Test4.test();
    }
}
