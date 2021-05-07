package Enthuware._07IO.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    static Path p1 = Paths.get("/a/b/c");
    static Path p2 = Paths.get("report.pdf");

    public static String getValue() {
        String x = p1.getName(1).toString();
        String y = p1.subpath(1, 2).toString();
        return x + " : " + y;
    }

    public static void main(String[] args) {
        System.out.println(getValue());
        System.out.println(p1.getRoot());
        System.out.println(p2.resolve(p1)); // /a/b/c
        System.out.println(p1.resolve(p2)); // a/b/c/report.pdf
    }
}
