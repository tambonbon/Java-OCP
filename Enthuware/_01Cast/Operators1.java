package Enthuware._01Cast;

public class Operators1 {
    public static int operator() {
        int x1 = -4;
        int x2 = x1--;
        System.out.println("x1 = " +x1);
        System.out.println("x2 = " +x2);
        int x3 = x2++;
        System.out.println("x2 = " +x2);
        System.out.println("x3 = " +x3);

        if (x2 > x3) {
            --x3;
        } else x1++;
        return x1+x2+x3;
    }
    public static void main(String[] args) {
        System.out.println(operator());
    }
}
