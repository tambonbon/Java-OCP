package Enthuware._07IO.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllLines {
    public static void main(String[] args) throws IOException{
        var path = Paths.get("Enthuware/_07IO/IO/1.txt");
        List<String> lines = Files.readAllLines(path); // readAllLines can result in OutOfMemoryError
        lines.forEach(System.out::println); 
    }
    
}
