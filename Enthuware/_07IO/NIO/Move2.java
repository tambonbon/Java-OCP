package Enthuware._07IO.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Move2 {
    public static void main(String[] args) throws IOException {
        /* Assume "a.java" exists in both directories: */
        Path p1 = Paths.get("Enthuware/_07IO/a.java");
        Path p2 = Paths.get("Enthuware/_07IO/NIO/a.java");

        Files.move(p1, p2, StandardCopyOption.ATOMIC_MOVE);

        Files.delete(p1);

        System.out.println(p1.toFile().exists() + " " +p2.toFile().exists()); // throw exception 

        /**
         * 1. Files.move tries to move the file to target file,
         *      failing if target file exists EXCEPT both source/target are same file
         * 2. When CopyOption is ATOMIC_MOVE, the op is dependent if target file exists 
          */
    }
}
