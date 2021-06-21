package Enthuware._04Arrays;

import java.util.Arrays;

public class CompareMismatch1 {
    public static void main(String[] args) {
        var a = new int[]{1,2,3,4,5};
        var b = new int[]{1,2,3,4,5,3};
        var c = new int[]{1,2,3,4,5,6};

        /** 
         * Compare two int arrays lexicographically 
         * @return: 0 if the 2 are equal and contain same element in same order
         * @return: < 0 if 1st array is lexicographically less than 2nd array
         * @return: > 0 other wise
         * The return value NOT depend on amount of different between 2 elements
        */
        int x = Arrays.compare(a, c);
        System.out.println(x); // -1
        int y = Arrays.compare(b, c);
        System.out.println(y); // -1

        /**
         * Find and return the index of the first mismatch between two int arrays,
         * otherwise return -1 if no mismatch is found
         */
        System.out.println(Arrays.mismatch(a, c)); // 5

        // Other examples:
        int[] ia1 = {0,1,4,5};
        int[] ia2 = {0,1,1,5,6};

        System.out.println(Arrays.compare(ia1, ia2) + " " + Arrays.mismatch(ia1, ia2)); // 1 2
        // because 1st array is larger than 2nd array at index 2
        // .. and the first difference is at index 2
    }
}
