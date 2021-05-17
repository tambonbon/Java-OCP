package Enthuware._01Cast;

public class Increm2 {
    public static void testInts(Integer obj, int var) {
        obj = var++;
        obj++;
    }

    public static void main(String[] args) {
        Integer val1 = Integer.valueOf(5);
        int val2 = 9;
        testInts(val1++, ++val2);
        System.out.println(val1 + " " + val2); // 6 10

        val1 = 5; 
        val2 = Integer.valueOf(9);
        testInts2(val1++, ++val2);
        System.out.println(val1 + " " + val2); // 6 10

        /**
         * When we call methods:
         * 1. In case of primitive variables, their values are passed
         * 2. In case of Objects, their reference values are passed
         */

    }

    public static void testInts2(int var, Integer obj) {
        var = obj++;
        var++;
    }
}
