package Enthuware._02JavaOOP.encapsulation.c;

import Chapter14.methodReference.Test;
import Enthuware._02JavaOOP.encapsulation.a.Movable;
import Enthuware._02JavaOOP.encapsulation.b.Donkey;

public class TestDonkey extends Donkey{
    public static void main(String[] args) {
        Movable m = new Donkey();
        m.move(10);
        m.moveBack(20);
        System.out.println(m.location); // 0
        
        Donkey d = new Donkey();
        d.move(10);
        d.moveBack(20);
        System.out.println(d.location); // 190 

        // TestDonkey t = new Donkey(); // WRONG 
        Donkey donk = new TestDonkey();
        TestDonkey t = new TestDonkey();
        t.move(10);
        t.moveBack(20);
        System.out.println(t.location); // 190

        Donkey donkey = new TestDonkey();
        donkey.move(10);
        donkey.moveBack(20);
        System.out.println(donkey.location); // 190
    }
    
}
