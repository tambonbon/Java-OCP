package Enthuware._02JavaOOA.overload;

public class OverloadBoxed1 {
    void probe(Object x) {System.out.println("In Object");}
    void probe(Number x) {System.out.println("In Number");}
    void probe(Integer x) {System.out.println("In Integer");}
    void probe(Long x) {System.out.println("In Long");}

    public static void main(String[] args) {
        // We try to pass a double
        double a = 10;
        new OverloadBoxed1().probe(a); // in number

        int b = 20;
        new OverloadBoxed1().probe(b); // in integer

        char c = 'a';
        new OverloadBoxed1().probe(c); // in object

        short s = 5;
        new OverloadBoxed1().probe(s); // in number

        byte byt = 1;
        new OverloadBoxed1().probe(byt); // in number
    }
}
