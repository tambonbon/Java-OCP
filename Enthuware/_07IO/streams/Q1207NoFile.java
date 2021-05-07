package Enthuware._07IO.streams;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Q1207NoFile {
    public static void main(String[] args) {
        var myfile = Paths.get("Enthuware/_07IO/streams/test2.txt");
        try ( var bufferedReader = Files.newBufferedReader(myfile, Charset.forName("US-ASCII"))) {

        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
