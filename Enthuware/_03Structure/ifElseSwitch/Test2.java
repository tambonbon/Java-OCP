package Enthuware._03Structure.ifElseSwitch;

public class Test2 {
    public static void main(String[] args) {
        int k = 0;
        int m = 0;
        System.out.println(k + " " + m);
        for (var i = 0; i <= 3; i++) {
            var count = i + 1;
            System.out.println("iteration " + count +": i = " + i);
            k++;
            if (i == 2) {
                System.out.println("i == 2 is true");
                System.out.println("k = " + k + ", m = " + m);
                continue;
            } else System.out.println("i == 2 is false");

            m++;
            System.out.println("k = " + k + ", m = " + m);
        }
        System.out.println(k + " " + m);
    }
}
