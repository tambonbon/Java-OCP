package Enthuware._01Cast;

public class BooleanPrecedence {
    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = false;
        if (b2 != b1 = !b2) {
            // boolean operators has precedence over = ...
            // .. in fact, = has the least precedence of all operators
            // So,  b2 != b1 = !b2  ---> b2 != b1 is eval first ---> if(false = !b2) ..
            // .. is INVALID
            // Had it been if(b2 = b1 != b2)
            System.out.println("true");
        }
    }
}
