package Enthuware._04Arrays;

public class ShortCircuit1 {
    public static void main(String[] args) {
        int i = 0;
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool  = false;

        bool = (bool2 & method1(i++)); 
        bool = (bool2 && method1(i++)); // i not calculated
        bool = (bool1 | method1(i++)); 
        bool = (bool1 || method1(i++)); // i not calculated

        System.out.println(i);
        
    }

    public static boolean method1(int i) {
        return i > 0 ? true : false;
    }
}
