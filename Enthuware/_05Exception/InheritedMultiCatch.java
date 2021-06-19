package Enthuware._05Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class InheritedMultiCatch {
    public static void main(String[] args) {
        // the user NOT have permission to a.java
        try (BufferedReader BufferedReader = new BufferedReader(new FileReader("D:/a.java"))) {
            String line = null;
            while ( (line = BufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (NoSuchFileException | IOException e) { // e is implicitly final ---> CANT be re-assigned
            // -------> NoSuchFileException is a SUBCLASS of IOException <-----
            // ---> CANT include classes related by inheritance in same multi-catch block
            e.printStackTrace();
        }
    }    
}
