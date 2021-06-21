package Enthuware._01String.LiteralStringDifferentPackage.package2;

import Enthuware._01String.LiteralStringDifferentPackage.package1.Other;

public class TestOther {
    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";

        System.out.println(TestOther.Other.hello == hello);
        System.out.println(Other.hello == hello);
        System.out.println(hello == ("Hel" + "lo")); // true
        System.out.println(hello == ("Hel" + lo)); // false
        System.out.println(hello == ("Hel" + lo).intern()); // true
    }    

    class Other {
        static String hello = "Hello"; 
    }

    /**
     * 1. Literal strings within the same class in the same package..
     * .. represent references to the same String object. 
         2. Literal strings within different classes in the same package..
         .. represent references to the same String object. 
        3. Literal strings within different classes in different packages likewise ..
         .. represent references to the same String object. 
        4. Strings computed by constant expressions are computed at compile time and then treated as if they were literals. 
        5. Strings computed at run time are newly created and therefore are distinct. (So line 4 prints false.)
        6. The result of explicitly interning a computed string is the same string as any pre-existing literal string with the same contents. (So line 5 prints true.)
     */
}
