package Enthuware._07IO.NIO;

import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopySymbolicLink {
    
    public static void copy1(Path p1, Path p2) throws Exception {
        Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
        /**
         * 1. If p1 is symbolic link ---> final target of that link is copied to p2
         * 2. If p2 is symbolic link ---> that link, and not target of that link, will be replaced
         */
    }
}
