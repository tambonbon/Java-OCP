package Enthuware._01Cast;

public class ChainEq {
    public static void main(String[] args) {
        int i, j, k;
        i = j = k = 9;
        System.out.println(i);
        /**
         * = can be chained !!!, provided all variables are declared before hand
         * However, chaining to use a value of a variable at the time of declaration is NOT allowed
         * i.e. int a = b = c = 100 is INVALID if b, c NOT already declared
         */
    }
    
}
