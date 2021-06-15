package Enthuware._02JavaOOP.overriding;

public class Override2 {
    public static void main(String[] args) {
        B test1 = new C();
        System.out.println(test1.max(10, 20)); // 80, because C's max is invoked..
        // .. as actual object referenced by test1 is of class C ..
        // .. even though declared type of test1 is of class B

        B test2 = new B();
        System.out.println(test2.max(10, 20));


    }

    static class A {
        int max(int x, int y) { 
            if (x > y) return x;
            else return y;
        }
    }

    static class B extends A {
        int max(int x, int y) { 
            return 2*super.max(x, y);
        }
    }

    static class C extends B {
        int max(int x, int y) { 
            return super.max(2*x, 2*y);
        }
    }
}