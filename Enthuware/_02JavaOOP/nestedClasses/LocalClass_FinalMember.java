package Enthuware._02JavaOOP.nestedClasses;

public class LocalClass_FinalMember {
    static int si = 10;
    int ii = 20;

    public static void inner() {
        // Since inner is static ---> only si & fai: accessible in class Inner !!!
        // Note: ai, ii NOT accessible
        // if inner is nonstatic ---> ii: also accessible in class Inner
        int ai = 30; // automatic variable
        ai =31;      // ai NOT effectively final anymore
        
        final int fai = 40;

        class Inner { // local class CANT be static
            public Inner() {
                System.out.println(si + "  " +fai);
                System.out.println(ai); // invalid ..
                // .. local variable defined in enclosing scope MUST be final/effectively final

                System.out.println(ii); // invalid ..
                // .. cannot make a static reference to non-static ii
            }
        }

        new Inner();
    }
    public static void main(String[] args) {
        LocalClass_FinalMember.inner();
    }
}
