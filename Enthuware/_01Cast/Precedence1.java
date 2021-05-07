package Enthuware._01Cast;

public class Precedence1 {
    public static void main(String[] args) {
        Object t = new Integer(107);
        Object t1 = Integer.valueOf(107);

        int k = (Integer) t.intValue()/9; // NOT COMPILE...
        // .. because . operator has more precedence than cast operator
        // we should do this:
        int k1 = ((Integer) t).intValue/9;
    }
}
