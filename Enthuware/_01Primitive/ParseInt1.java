package Enthuware._01Primitive;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParseInt1 {
    public static void main(String[] args) {
        Integer i = Integer.parseInt(args[0]);
        Integer j = i;
        i--;
        i++;
        System.out.println(i==j); // when it returns true?
        /**
         * All wrapper objects are immutable
         * ---> when you do i++, what actually happens is:
         * `i = Integer.valueOf(i.intValue() + 1)`
         * 
         * To save memory, Java "reuses" all wrapper objects whose values fall in:
         * 1. All Boolean
         * 2. All Byte
         * 3. All Character from 0 to 127
         * 4. All Short and Integer from -128 to 127
         * 
         * ===> == ALWAYS return TRUE when their primitive values are:
         * a. the same
         * b. belong to above list of values
         */

         // another example:
         Integer m = 10; // Wrapper created w/o using new ---> cached
         Integer n = 10; // cached object is re-used --> no new object created
         Integer o = new Integer(10); // new object is created
         
         System.out.println(m == n);
         System.out.println(m == o);
    }
}
