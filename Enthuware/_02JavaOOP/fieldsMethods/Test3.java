package Enthuware._02JavaOOP.fieldsMethods;

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
        System.out.println(x); // 12
        final var a = new Test3(5);
        var b = new Test3(10);
        a.link = b;
        System.out.println(a.value); //5
        System.out.println(b.value); // 10
        System.out.println(a.link.value); // 10
        
        // b.link =  a; // uncomment --> fine
        // System.out.println(b.link.value); // NPE

        b.link = setIt(a, b);
        // when this method executes,
        // a.link becomes null bc b.link is null ---> a.link.value throws NPE
        System.out.println(a.link.value); // NPE
        System.out.println(b.link.value); // 5
    }

    private static Test3 setIt(final Test3 a, final Test3 b) {
        a.link = b.link;
        return a;
    }
}
