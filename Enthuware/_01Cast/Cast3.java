package Enthuware._01Cast;

public class Cast3 {
    public static void main(String[] args) {
        int x = 5;
        x = x/2;
        System.out.println("x = " + x); // x = 2

        x = 5;
        double y = x/2;
        System.out.println("y = " + y); // y = 2.0, as integer division (==2) then widening to double

        double z = x/2.0; // z = 2.5
        double r = (double) x/2; // r = 2.5, cast has higher precedence than division operator
        // so (double) x/2 is equal to ((double)x)/2, NOT (double)(x/2)
        double s = (double)(x/2); // s = y = 2.0

        System.out.println("z = " + z);
        System.out.println("r = " + r);
        System.out.println("s = " + s);
        
    }
}
