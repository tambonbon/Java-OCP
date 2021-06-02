package Enthuware._10StreamsLambda.FI;

import java.util.function.Function;

public class OperandsOfConcat {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcd");

        Function f = i -> i+1; 
        // Since f is untyped Function ---> input: Object, output: Object,
        // but, you CANT Object + int like this
        // bc at least 1 operands of + MUST be String
        // &&, StringBuilder's replace expectes a String in 3rd argument !!!!

        Function<Character, String> f2 = i -> ""+Character.valueOf((char)(i+1));
        // f2.apply('as');
    }
}
