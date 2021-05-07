package Enthuware._01Cast;

public class BooleanPrecedence2 {
    public static void main(String[] args) {
        boolean b1 = false;
        int i1 = 2;
        int i2 = 3;
        if (b1 = i1 == i2) {
            System.out.println("true");
        } else System.out.println("false");
        // WIll print false..
        // because if(b1 = i1 == i2) --> if (b1 = 2 == 3) ---> if(b1 = false)..
        // ..which returns false ..
        // .. now, this is different from what we've seen from BooleanPrecedence.java..
        //.. that if(false = b2) is INVALID, while if(b1 = false) is fine

        if (false = b1) { }
        if (b1 = false) { }
    }
}
