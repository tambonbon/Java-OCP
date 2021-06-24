package Enthuware._02JavaOOP.instantiate;

public class MemberDeclarations {
    
    static class StaticFieldNonStaticMethodOK {
        static int a;
        int func() {
            return a;
        }
    }

    static class NonStaticFieldStaticMethodNotOK {
        int a;
        static int func() {
            return a; // CANT make a static reference to non-static field a
        }
    }
}
