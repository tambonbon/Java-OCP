package Enthuware._02JavaOOA.encapsulation.b;

import Enthuware._02JavaOOA.encapsulation.a.Test;

public class Tester extends Test{
    public static void main(String[] args) {
        Tester ref1 = new Tester();
        ref1.c();

        Test ref2 = new Test();
        ref2.d() // since it's from public method
        // ref2.c() // WRONG, because ref2 is Test, not Tester
    }
    
}
