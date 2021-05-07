package Enthuware._07IO.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class BufferWrap {
    public static void main(String[] args) throws Exception {
        var file = new File("x");
        var bufferedReader1 = new BufferedReader(new FileReader(file));
        var bufferedReader2 = new BufferedReader(bufferedReader1);
        // BufferedReader can wrap any Reader
        
        var printWriter = new PrintWriter(new FileReader(file));
        // error, a Reader CANT be converted into a Writer, and vice-versa
        // ---> NO WAY we can chain a Reader and a Writer together
    }
}
