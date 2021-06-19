package Enthuware._04Arrays;

public class RealBrainerArray {
    public static int[] getArray() {
        return null;
    }

    public static void main(String[] args) {
        var index = 1;
        try {
            getArray()[index=2]++; // it even compiles !!
        }
        catch (Exception e ) { }

        System.out.println("index = " + index); // 2
    }
    /**
     * 1. If array reference expr produces null  ---> NPE thrown at RT..
     * .. but only after all parts of the array reference expr have been evaluated normally
     * 
     * Thus, first index=2 will be executed, which assigns 2 to index
     * After that, null[2] is executed ==> NPE
     * In fact, NPE was thrown but catch clause was empty
     */
}
