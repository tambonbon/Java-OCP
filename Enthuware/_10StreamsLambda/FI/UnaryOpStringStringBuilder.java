package Enthuware._10StreamsLambda.FI;

import java.util.function.UnaryOperator;

public class UnaryOpStringStringBuilder {
    public static void main(String[] args) {
        String val1 = "hello";
        StringBuilder val2 = new StringBuilder("world");

        UnaryOperator<String> uo1 = s1-> s1.concat(val1);

        System.out.println(uo1.apply(val1));
        System.out.println(uo1.apply(val2)); // invalid, becaue val2 is StringBuilder!!
    }
}
