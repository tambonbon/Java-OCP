package Enthuware._02JavaOOP.nestedClasses;

public class NonStaticInner {

    static class Nesting {
        public static void main(String[] args) {
            B.C obj = new B().new C(); // a c d c
        }
    }

    static class A { 
        char c;
        A(char c) {
            this.c = c;
        }
    }

    static class B extends A {
        char c = 'a';
        B() {
            super('b');
        }
        class C extends A {
            char c = 'c';
            C() {
                super('d');
                System.out.println(B.this.c); // a
                System.out.println(C.this.c); // c
                System.out.println(super.c); // d
                System.out.println(this.c); // c
            }
        }
    }

    /**
     * Every non-static inner class has a reference to its outer class which can be accessed by OuterClass.this
     * ===> `B.this.c` --> B's c, whose value = 'a'
     * Inside non-static, `InnerClass.this` == `this` 
     * ===> `C.this.c` --> C's c, which is 'c'
     * `super.c` will access variable from A, the superclas of C whose value is 'd'
     */
}
