package Enthuware._07IO.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GetRoot1 {
    
    static Path p1 = Paths.get("/main/project/Starter.java");

    public static String getRoot() {
        String root = p1.getRoot().toString();
        return root;
    }
    
    public static void main(String[] args) {
        System.out.println(getRoot()); // /
    }

    /*
     Indiced for path names start from 0 
     Root is not included
     
     p1.getRoot() is /, or c:\ in Windows
     p1.getName(0) is main 
     p1.getName(3) throws IllegalArgumentException
     */
}
