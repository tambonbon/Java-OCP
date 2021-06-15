package Enthuware._07IO.NIO;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;

public class TraverseTree {
    
    // This method walks a directory tree and return the total size of all files in the dir
    // public static long getSize(Path path) throws IOException{ // if throws IOException here --> l23 error ? why?
    //     // try {
            
    //     // } catch (IOException exception) { }
    //     // return 0L;
    // }

    public long getPathSize(Path src) throws IOException{
        try (var s = Files.walk(src, // walk() uses depth-first
                 10, // checks for files only within 10 steps of starting nodes
                 FileVisitOption.FOLLOW_LINKS)) {  // walk() by default NOT FOLLOW SYMBOLIC BY DEFAULT & REQUIRE FOLLOW_LINK TO ENABLE --> be cautious of circular path
            return s.parallel()
                    .filter(path -> !Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS))
                    .mapToLong(p -> { // try/catch in lambda 
                        try { 
                            return Files.size(p);
                            } catch (Exception e) {
                        } return 0;
                    }) // can i throw exception for lambda?
                    .sum();
        } 
        // return 0; // need this if have catch clause
    }
}
