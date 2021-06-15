package Enthuware._02JavaOOP.interfaces;

public class ExtImplStatic {
    class Foo1 implements Bar, FooBase { // FooBase.bar is default
        // @Override
        // public void bar() {
        //     // MUST override Bar.bar, even though FooBase.Bar is implemented (but static)
        //     // If FooBase.bar is default (not static) ---> compile error
        // }
    }

    class Foo2 implements Bar, FooBase1 { // FooBase1.bar is static
        @Override
        public void bar() {
        }
    }

    class Foo3 extends FooBase2 implements Bar { // FooBase2.bar is non-static
        @Override
        public void bar() {
            super.bar();
        }
    }

    static class Foo4 extends FooBase3 implements Bar { // FooBase3.bar is static
        // Foo4 gets static `bar()` from FooBase3 + Foo4 needs to implement bar from interface Bar
        // ---> FAIL
        // because a class CANT have 2 methods with same signature, where 1 is static, 1 is instance
        // fix: make FooBase3.bar private
        @Override
        public static void bar() {
            super.bar();
        }
    }
}

interface Bar {
    void bar();
}

interface FooBase {
    public default void bar() {
        System.out.println("In static bar");
    }
}

interface FooBase1 {
    public static void bar() {
        System.out.println("In static bar");
    } 
}

abstract class FooBase2 {
    public void bar() {
        System.out.println("In static bar");
    }
}

abstract class FooBase3 {
    public static void bar() {
        System.out.println("In static bar");
    }
}