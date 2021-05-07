package Enthuware._01Cast;

public class Cast2 {
    public static void main(String[] args) {
        int i =5 ;
        float f = 5.5f;
        double d = 3.8;
        char c = 'a';
        if (i != f) c++;
        System.out.println(c); // b

        c = 'a';
        if (((int) (f + d)) != ((int) f + (int) d)) c +=2; // 8 != 9
        System.out.println(c); // c

        double tax = 0;
        long grossIncome = 18_000;
        tax = grossIncome>18000 ? grossIncome<=36000 ? .1 : .2 : 0;
        tax = grossIncome<18000 ? 0 : grossIncome<36000 ? .1 : .2; 

        int rate = 10;
        var amount = 1 - rate/100*1;
        // amount can be int, long, float or double
        var amount = rate/100;
    }
}
