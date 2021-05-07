package Enthuware._07IO.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.OutputStream;

public class Q1202_Copy {
    public static void copy(String records1, String records2) throws IOException {
        try (InputStream inputStream = new FileInputStream(records1);
            OutputStream outputStream = new FileOutputStream(records2);) {
                var buffer = new byte[1024]; // what this does?
                var bytesRead = 0; // what this does?
                while ((bytesRead = inputStream.read(buffer)) != -1 ) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            } catch (FileNotFoundException | InvalidClassException exception) {
                exception.printStackTrace();
            }
    }

    public static void main(String[] args) throws Exception {
        copy("/Users/tammy/javaProjects/OCP/Chapter19/z.txt", " /Users/tammy/javaProjects/OCP/Chapter19/y.txt");
    }
}
