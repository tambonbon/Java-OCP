package Enthuware._04Arrays;

public class CallByValue1 {
    public static void main(String[] args) {
        int i = 1;
        int[] iArr = {1};
        incr(i);
        incr(iArr);
        System.out.println("i = " + i + " iArr[0] = " + iArr[0]); //i = 1 iArr[0] = 2

        /**
         * eventhough we call incr(i) to increment i to 1...
         * .. i is not an object, so it's called by name..
         * .. ---> value of 1 is returned..
         * .. while array is object, so it's called by reference..
         * .. ---> value of incremented of 2 is returned
         */
    }

    public static void incr(int n) {
        n++;
    }

    public static void incr(int[] n) {
        n[0]++;
    }
}

