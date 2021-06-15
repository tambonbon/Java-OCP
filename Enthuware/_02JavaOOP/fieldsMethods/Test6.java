package Enthuware._02JavaOOP.fieldsMethods;

public class Test6 {
    static int a = 0;
    static int b = 5;

    public void foo() {
        while(b>0) {
            b--;
            a++;
        }
    }
    public static void main(String[] args) {
        var p1 = new Test6();
        p1.foo();
        var p2 = new Test6();
        p2.foo();

        System.out.println(p1.a + " " + Test6.a); // 10 10 if b is non-static, 5 5 if b static
    }
}
