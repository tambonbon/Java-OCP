package Enthuware._03Structure.ifElseSwitch;

public class EnumSwitch2 {
    public static void main(String[] args) {
        var s = Switch.OFF;       

        // valid use:
        if (s.equals(Switch.OFF)) { System.out.println("off");}
        if (s == Switch.OFF) { System.out.println();}

        switch(s) {
            case OFF : System.out.println(); break;
        }

        // invalid use:
        switch(s) {
            // case Switch.OFF: // must be OFF instead
        }

        switch(s) {
            case OFF.toString(): // invalid
            // 1. The type of case value MUST match with type of switch expression
            // -- here, type switch expr: Switch enum, while type of OFF.toString: String
            // 2. Case value should be compile time constant
            // ---> CANT have method calls as case labels
        }
    }
}

enum Switch {
    ON, OFF
}