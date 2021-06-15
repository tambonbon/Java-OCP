package Enthuware._02JavaOOP.nestedClasses;

import java.awt.*;
import java.awt.event.*;

public class AccessStatic{
    String s = "Message";

    public static void main(String[] args) {
        System.out.println("Message is: " + s); // invalid
    }

    public void notMain() {
        System.out.println("Message is: " + s); // valid, because notMain is non-static accessing non-static field
    }
}
