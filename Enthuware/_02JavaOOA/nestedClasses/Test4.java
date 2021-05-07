package Enthuware._02JavaOOA.nestedClasses;

public class Test4 {
    class Inner1 {
        static void member1() { } // WRONG, bc Inner1 is not static ---> CANT have static member
        static final int k = 10; // RIGHT, bc k is final
    }
    static class Inner2 {
        static void member1() { }
        void member2() { } // static nested class (Inner2) can contain non-static member
    }
    Test4 test4 = new Test4() {
        public void hello(String s) {
            // anonymous class implicitly extends Object
            // NOT allowed to explicitly extend/implement 
        }
    }; 
    public Test4() {}

    // another example of anonymous class
    public Test4(int i) { }
    public void m1() {
        Test4 test = new Test4(10) {
            public void hello(String s) { }
        };
    }

    class Haha { 
        static class Hehe { } // CANT BE STATIC
    }

    static class classHoho {
        static class Hehe { } // CAN be static
    }
}
