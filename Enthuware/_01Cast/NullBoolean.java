package Enthuware._01Cast;

public class NullBoolean {
    
    public static void main(String[] args) {
        // all 3 are INVALID
        System.out.println(null + true); // + is undefined for null,boolean
        System.out.println(true + null);
        System.out.println(null + null);

        /* None of the params is a String --> NO CONVERSION TO STRING !! */
    }
}
