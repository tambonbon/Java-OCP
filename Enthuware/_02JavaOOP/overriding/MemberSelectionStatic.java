package Enthuware._02JavaOOP.overriding;

public class MemberSelectionStatic {

    static class Base {
        static String ior;
        
        Base() { startUp("IOR"); }
        
        static void startUp(String s) {ior = s; } // ior MUST be static to be called in static method

        static void print() { System.out.println(ior);}
    }

    static class Sub extends Base {
        
        Sub() { }
        
        static void startUp(String s) { ior = getIORFromURL(s); }

        static String getIORFromURL(String s) { return "URL:// " + s;}
    }

    public static void main(String[] args) {
        
        start(new Sub()); // IOR
        /**
         * The constructor at L8 is called, which invokes startUp() method..
         * .. Now, the question: Which `startUp()` will be invoked? As there're 2 `startUp()`...
         * -----> The METHOD SELECTION is done on the basis of the actual class of object <-----
         * which is Sub here 
         * ===> l19 is called
         * 
         * ----> The VARIABLE/STATIC METHOD SELECTION is done on basis of the declared class, NOT ON ACTUAL CLASS of object <-----
         */



    }

    static void start(Base base) { Base.print();}
}
