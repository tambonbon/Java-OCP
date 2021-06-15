package Enthuware._02JavaOOP.interfaces;

public class Test6 implements T1, T2{
    public void m1() { }    
    /**
     * Inheriting ambiguous fields/methods NOT cause any problem except in the case of default methods
     * Referring ambiguous fields/methods CAUSES problems i.e. sysout(value) bc it will be ambiguous
     */

     public static void main(String[] args) {
        Test6 test6 = new Test6();
        System.out.println(((T1) test6).value); // valid
     }
}

interface T1 {
    int value = 1;
    void m1();
}

interface T2 {
    int value =2 ;
    void m1();
}