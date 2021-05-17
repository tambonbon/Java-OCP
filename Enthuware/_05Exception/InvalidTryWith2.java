package Enthuware._05Exception;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class InvalidTryWith2 {
    public static void main(String[] args) throws IOException{
        final Reader reader = new FileReader("aaa.a"); // assume this file NOT existed
        try (reader) {
            reader.read();
        } finally {
            reader.read();
        }
        reader.read();

        final InputStream fis = new FileInputStream("aaa.a"); // assume this file EXISTED...
        long l = 0;
        try (fis) {
            l = fis.read();
        } finally {
            l = fis.read(); // ... then this throws Exception bc fis is closed already
        }
        l = fis.read();

    }
}
