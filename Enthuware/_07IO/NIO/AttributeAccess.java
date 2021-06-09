package Enthuware._07IO.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class AttributeAccess {
    public static void main(String[] args) throws IOException { // always check for exceptions !!!
        var path = Paths.get("Enthuware/_07IO/IO/1.txt");
        BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println(data.lastModifiedTime()); // 2021-06-09T13:32:31.820214Z
    }
    
}
