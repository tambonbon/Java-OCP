package Enthuware._07IO.NIO;

import java.nio.file.Path;

public class Resolve {
    public static void main(String[] args) {
        // try to resolve 2 relative paths
        System.out.println(Path.of("_07IO").resolve("NIO")); // _07IO/NIO (they concat)

        // resolve a relative path to an absolute path
        System.out.println(Path.of("/Documents/Hello").resolve("Downloads")); // /Documents/Hello/Downloads (they concat)
        
        // resolve 2 absolute paths
        System.out.println(Path.of("/Documents/Hello").resolve("/Downloads")); // Downloads (the resolving input is returned)
    }
}
