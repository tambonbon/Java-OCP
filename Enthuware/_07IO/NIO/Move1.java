package Enthuware._07IO.NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Move1 {
    public static void main(String[] args) {
        String s = "Enthuware/_07IO/NIO/test.txt";
        String d = "Enthuware/_07IO/serialization/test.txt";

        /**
         * Question: How to move the file test.txt to the destination location...
         * .. even if a file by the same name already exists at the destination?
         */

         try {
             Files.move(Paths.get(s), Paths.get(d), StandardCopyOption.REPLACE_EXISTING);
             /** 
              * ATOMIC_MOVE: move the file as an atomic file system operation
              * COPY_ATTRIBUTES: copy attributes to the new file
              * REPLACE_EXISTING: replace an existing file if it exists
              *
              * It will throw exception if the file already exists at the destination
              */
         } catch (Exception exception){ }
    }
}
