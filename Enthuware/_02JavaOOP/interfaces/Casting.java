package Enthuware._02JavaOOP.interfaces;

public class Casting {
    static class Test1 implements I1, I2 {
        public void m1() { System.out.println("Hello");}
        public static void main(String[] args) {
            Test1 test1 = new Test1();
            ((I1) test1).m1(); // Hello
            ((I2) test1).m1(); // Hello

            System.out.println(((I1) test1).VALUE);
            System.out.println(((I2) test1).VALUE);
        }
    }
    static interface I1 {
        int VALUE = 1;
        void m1();
    }

    static interface I2 {
        int VALUE = 2;
        void m1();
    }
}
