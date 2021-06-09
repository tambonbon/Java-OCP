package Enthuware._07IO.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileWLines {
    // readAllLines() are not effective with large files ..
    // .. while lines() is lazy evaluated
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/fish/shard");
        try (var s = Files.lines(path)) {
            s.filter(f -> f.startsWith("WARN")) // s is a stream
            .forEach(System.out::println);
        }
    }
    
}
