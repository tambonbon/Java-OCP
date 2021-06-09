package Enthuware._07IO.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyDestNotExist {
    void copyFile(File src, File dest) throws IOException {
        try (var in = new FileInputStream(src);
            var out = new FileOutputStream(dest)) {
                int b ;
                while ((b = in.read()) != -1) {
                    out.write(b);
                }
            }
    }    

    public static void main(String[] args) throws IOException{
        // copy  to a non-existent file
        new CopyDestNotExist()
            .copyFile(new File("Enthuware/_07IO/IO/1.txt"), new File("Enthuware/_07IO/IO/2.txt")); 

        // copy from a non-existent file ---> FileNotFound exception

        Files.copy(Path.of("Enthuware/_07IO/IO/1.txt"), Path.of( "Enthuware/_07IO/IO/4.txt")); // create 4.txt when it NOT exist
        Files.copy(Path.of("Enthuware/_07IO/IO/1.txt"), Path.of( "Enthuware/_07IO/IO/4.txt")); // throw exception as 4.txt exists already
    }
}
