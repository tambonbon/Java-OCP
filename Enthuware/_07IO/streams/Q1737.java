package Enthuware._07IO.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Q1737 {
    public static void main(String[] args) {
        try (Reader r = new BufferedReader(new FileReader("Enthuware/_07IO/streams/test1.txt"))) {
            if (r.markSupported()) {
                BufferedReader bufferedReader = (BufferedReader) r;
                System.out.println(bufferedReader.readLine());
                bufferedReader.mark(100);
                // 100 is the limit on the number of characters..
                // .. that may be read while still preserving the mark
                System.out.println(bufferedReader.readLine());
                System.out.println(bufferedReader.readLine());
                bufferedReader.reset();
                System.out.println(bufferedReader.readLine());
                bufferedReader.reset();
                System.out.println(bufferedReader.readLine());
                bufferedReader.close();
            } else {
                System.out.println("Mark not supported");
            } 
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
