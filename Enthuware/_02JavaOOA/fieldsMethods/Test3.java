package Enthuware._02JavaOOA.fieldsMethods;

public class Test3 {
    int value = 1;
    Test3 link;
    
    public Test3(int val) {
        this.value = val;
    }
    static int x =5;
    public static void main(String[] args) {
        char[    ] cA = {'a'};
        int x = (x=3) * 4;
        System.out.println(x);
        final var a = new Test3(5);
        var b = new Test3(10);
        a.link = b;
        System.out.println(a.value);
        System.out.println(b.value);
        System.out.println(a.link.value);
        // System.out.println(b.link.value); // NPE

        b.link = setIt(a, b);
        // when this method executes,
        // a.link becomes null bc b.link is null ---> a.link.value throws NPE
        System.out.println(a.link.value);
        System.out.println(b.link.value);
    }

    private static Test3 setIt(final Test3 a, final Test3 b) {
        a.link = b.link;
        return a;
    }
}
