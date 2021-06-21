package Enthuware._07IO.IO;

import java.io.Console;

public class ConsoleInBackground {
    public static void main(String[] args) {
        Console c = System.console();
        String line = c.readLine("Please enter your name");
        System.out.println("Hello, " + line);
        /* Above code runs fine..
        .. But assume it runs in background by a scheduler
        ---> no console is available to it !!!
        -----> System.console() return null -----> NPE
         */

        // right way of doing this:
        Console console = System.console();
        String line = null;
        if (console != null) {
            line = console.readLine("Please enter your name ");
        } else { // do something
        }
    }
}
