package Enthuware._01Cast;

public class Cast {
    public static void main(String[] args) {
        byte b = 1;
        char c = 1;
        short s = 1;
        int i = 1;

        s = s + i; // invalid (short = short + int -> short = int <- wrong)
        s += i; // this works because it is implicitly s = (short) (s + i)

        i = b + 1; 
        b = i + 1; // invalid

        i = b + s;
        i = b + c;

        s = i; // invalid
        s = (short) i; // downcast int to short
        s *= i; // short = (short) short * int (implicitly)

        c = c * b; // char +-*/ byte = int
        c *= b; // valid,  char = (char) char * byte
    }
}
