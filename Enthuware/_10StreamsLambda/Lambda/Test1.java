package Enthuware._10StreamsLambda.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Test1 {
    public static void main(String[] args) {
        List<Double> dList = Arrays.asList(10.0, 12.0);
        dList.forEach(x -> { x = x+10;});
        dList.forEach(x -> System.out.println(x));

        List<StringBuilder> dList2 = Arrays.asList(
            new StringBuilder("a"), new StringBuilder("ab"));
            dList2.forEach(x -> { x = x.append(10);});
            dList2.forEach(x -> System.out.println(x));       

        // BiFunction<Integer, Integer, Double> bf = (a,b) -> a/b; // CANT convert from int to Doube
        BiFunction<Integer, Integer, Integer> bf = (a,b) -> a/b; 
        BiFunction<Integer, Integer, Double> bf2 = (a,b) -> (double) a/b; 

    }   
    class Transformer<T> {
        // if getMethod is static ---> NOT compile
        // bc type variable T is available only for instances of Tranformers
        public BiFunction<T,T,T> getMethod() {
            return null;
        }
    }

    public BiFunction<Integer, String, Double> getBF() { return null;}
}
