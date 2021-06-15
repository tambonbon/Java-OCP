package Enthuware._07IO.streams;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {
    // valid methods
    public void outputText1(PrintWriter pw, String text) {
        pw.write(text);
        if(pw.checkError()) System.out.println("exception in writing");
    }
    // None of PrintWriter throws any IO Exceptions !
    // checkError returns true if there's a problem in writing

    public void outputText2(PrintWriter pw, String text) {
        pw.printf(text).print("success");
    }
    // PrintWriter has printf(Locale l, Stirng format, Object... args) && printf(String format, Object... args)
    // ---> allow to format input before printing


    // Invalid methods
    public void outputText3(PrintWriter pw, String text) {
        try {
            pw.write(text);
        } catch (IOException exception) { // unreachable code
            System.out.println("exception in writing");
        }
    }

    public void outputText4(PrintWriter pw, String text) {
        pw.println(text).println("success"); // CANT chain anything to println
    }
}
