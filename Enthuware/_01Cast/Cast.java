package Enthuware._01Cast;

public class Cast {
    public static void main(String[] args) {
        byte b = 1;
        char c = 1;
        short s = 1;
        int i = 1;

        s = s + i;
        s += i; // this works because it is implicitly s = (short) (s + i)

        i = b + 1; 
        b = i + 1;

        i = b + s;
        i = b + c;

        s = i;
        s = (short) i;
        s *= i;

        c = c * b; // multiply ---> int
        c *= b;
    }
}
