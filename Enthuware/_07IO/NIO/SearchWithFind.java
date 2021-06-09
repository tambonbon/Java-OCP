package Enthuware._07IO.NIO;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class SearchWithFind {
    public static void main(String[] args) throws IOException {
        // find() behaves similarly with walk(), but it takes a BiPredicate to filter data
        // 2 params: Path and BasicFileAttributes

        Path path = Path.of("/bigcats");
        long minSize = 1000;

        try (var s = Files.find(
            path, 
            10, 
            (p, a) -> a.isRegularFile() && p.toString().endsWith(".java") && a.size() > minSize, 
            FileVisitOption.FOLLOW_LINKS)) {
                s.forEach(System.out::println);
            }

        // it could have been like this
        BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
        if (data.isRegularFile() && data.toString().endsWith("java") && data.size() > minSize) {
            System.out.println(data);
        }
    }
}
