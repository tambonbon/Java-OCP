package Enthuware._12Annotations;

import java.lang.annotation.Repeatable;

public class Repeatable1 {
        // valid use:
    @Authors(@Author("bob"))
    final void m1() {
        System.out.println();
    }
        
    @Author("bob")
    @Authors(@Author("alice"))
    void m2() { }
    
    // invalid use:
    @Author(1, "bob")
    void m3() { }
}

@interface Authors { 
    Author[] value();
}

@Repeatable(Authors.class)
@interface Author {
    int id() default 0;
    String value();
}

