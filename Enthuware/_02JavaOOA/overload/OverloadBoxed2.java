package Enthuware._02JavaOOA.overload;

public class OverloadBoxed2 {
    /** Rules:
     * 1. Compiler always tries to choose the most specific method available with least modifications
     * 2. Java designers decided that old code should work exactly as it used to work before boxing-unboxing become a thing
     * 3. Widening is preferred to boxing/unboxing, which in turn, is preferred over var-args
     * ---> Thus:
     * 1. probe(Integer) will be bound to probe(Integer) (exact match);...
     * .. if that's not possible --> bound to probe(long), then with probe(int...) ..
     * ... probe(long) preferred over probe(int...) because unboxing an Integer gived an int, and 
     * .... probe(long) is compatible with an int
     * * It's never bound to probe(Long) because Integer and Long are 2 different objects 
     * (this holds true for any wrappers)
     * 
     * 2. probe(int) is bound to probe(long), then to probe(Integer) because boxing an int...
     * ... gives an Integer, matching exactly to probe(Integer), then to probe(int...)
     * * It's never bound to probe(Long)
     */
    void probe(int... x) { System.out.println("In ...");}

    void probe(Integer x) {System.out.println("In Integer");}

    void probe(long x) {System.out.println("In long");}

    void probe(Long x) {System.out.println("In Long");}

    public static void main(String[] args) {
        Integer a = 4; 
        new OverloadBoxed2().probe(a); // In Integer

        int b = 4;
        new OverloadBoxed2().probe(b); // In long

        short s = 1;
        new OverloadBoxed2().probe(s); // in long

        byte c = 'a';
        new OverloadBoxed2().probe(c); // in long
    }
} 
