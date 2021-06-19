package Enthuware._07IO.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Relativize {
    public static void main(String[] args) {

        // scenario 1: both are relative paths
        Path p1 = Paths.get("photos/goa");
        Path p2 = Paths.get("videos/mumbai1");

        System.out.println(p1.relativize(p2)); // ../../videos/mumbai1
        System.out.println(p2.relativize(p1)); // ../../photos/goa

        // scenario 2: one of them is absolute
        p1 = Paths.get("/musics/dehli");

        // System.out.println(p1.relativize(p2)); // IllegalArgumentEx
        // System.out.println(p2.relativize(p1)); // IllegalArgumentExc

        // scenario 3: both are absolute
        p2 = Paths.get("/records/chennai");
        System.out.println(p1.relativize(p2)); // ../../records/chennai (show p2)
    }
}
