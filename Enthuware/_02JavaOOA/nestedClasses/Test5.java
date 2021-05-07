package Enthuware._02JavaOOA.nestedClasses;

public class Test5 {
    static int si = 10;
    int ii = 20;

    public static void inner() {
        // Since inner is static ---> only si & fai: accessible in class Inner !!!
        // Note: ai NOT accessible
        // if inner is nonstatic ---> ii: also accessible in class Inner
        int ai = 30; // automatic variable
        ai =31;      // ai NOT effectively final anymore

        final int fai = 40;

        class Inner {
            public Inner() {
                System.out.println(si + "  " +fai);
                // System.out.println(ai);
            }
        }

        new Inner();
    }
    public static void main(String[] args) {
        Test5.inner();
    }
}
