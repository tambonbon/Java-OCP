package Enthuware._02JavaOOA.encapsulation.a;

import java.util.List;

public class ClassInA {
    protected ClassInA(List<String> list) {
        System.out.println("This is in A");
    }

    protected ClassInA() { }
    public void method() {
        System.out.println("Hi");
    }
}
