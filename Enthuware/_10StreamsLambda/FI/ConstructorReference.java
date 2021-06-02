package Enthuware._10StreamsLambda.FI;

import java.util.function.Function;
import java.util.function.Supplier;

class MyProcressor{
    int value;
    public MyProcressor() {
        value = 10;
    }
    public MyProcressor(int value) {
        this.value = value;
    }
    public void process() {
        System.out.println("Processing " +value);
    }
}

public class ConstructorReference {
    /* 
    With constructor references, 
    YOU CAN NEVER PASS ARGUMENTS WHILE REFERRING TO A CONSTRUCTOR OR A METHOD 
    They are mere references, not invocation
    */
    public static void main(String[] args) {
        Supplier<MyProcressor> supplier = MyProcressor::new;
        // This tells compiler to get the constructor reference of constructor
        // that NOT take any argument
        // bc Supplier NOT take any argument
        MyProcressor mp = supplier.get();
        mp.process();

        Function<Integer, MyProcressor> f = MyProcressor::new;
        // This tells the compiler to get the constructor reference of the constructor
        // that takes one Integer argument
        MyProcressor mp1= f.apply(5);
        mp1.process();

        // Arguments are required only when actually invoke the constructor/method
        // MyProcressor::new(10) // NOT MAKE SENSE 
        // line 36 does that
    }
    

}
