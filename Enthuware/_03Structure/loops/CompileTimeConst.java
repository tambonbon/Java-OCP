package Enthuware._03Structure.loops;

public class CompileTimeConst {
    public static void main(String[] args) {
        int x = 0;

        // Valid codes:
        if (false) { x = 3; }
        /**
         * Even though x = 3 is unreachable ..
         * .. but NOT error because it's an exception to the rule
         */
        do {x = 3; }
            while(false);

        for (var i = 0; i < 0; i++) {
            x = 3;
        }

        // Invalid codes:
        while (false) { x = 3 ;} // if while(true) --> valid
        for (int i = 0; true ; i++) x = 3; // if for (; true; ) ---> valid
        /**
         * The compiler can only look for compile-time constant values ..
         * .. to determine a code is reachable or not
         * The following is valid:
         *      boolean b = false;
         *      for (; b; ) { x = 3} 
         * Because, b is a variable, NOT compile-time constant..
         * .. if make b final ---> it is compile-time constant and then NOT compile
         */
    }
}
