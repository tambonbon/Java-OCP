package Enthuware._10StreamsLambda.FI;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class Test3 {
    public static int operate(IntUnaryOperator iuo) {
        return iuo.applyAsInt(5);
    }

    public static void main(String[] args) {
        /* 
        IntFunction is a FI taking an int & return whatever it's typed to
        Here, IntFunction is typed to IntUnaryOperator.
        General form of lambda for IntFunction is x -> "line of code", 
        where x: Int, "line of code": IntUnaryOp

        IntUnaryOperator is FI taking an in & return another int
        General form of lambda is y -> "line of code",
        where y: Int, "line of code": Int
         */
        IntFunction<IntUnaryOperator> fo = a -> b -> a - b;
        // ==== a -> (b->a-b)
        // a: argument variable of type int (bc used to capture IntFunction)
        // b -> a - b: method body of IntFunction, and MUST return IntUnaryOperator
        // b: argument variable; a - b: method body of IntUnaryOperator
        // 
        int x = operate(fo.apply(20));
        // a is set to 20, and b is set to 5 ---> 15
        System.out.println(x);
    }
}
