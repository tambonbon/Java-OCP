package Enthuware._02JavaOOP.overriding;

public class MemberSelection {

    static class Base {
        String ior;
        
        Base() { startUp("IOR"); }
        
        void startUp(String s) {ior = s; }

        void print() { System.out.println(ior);}
    }

    static class Sub extends Base {
        
        Sub() { }
        
        void startUp(String s) { ior = getIORFromURL(s); }

        String getIORFromURL(String s) { return "URL:// " + s;}
    }

    public static void main(String[] args) {
        
        start(new Sub()); // URL:// IOR
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

    static void start(Base base) { base.print();}
}
