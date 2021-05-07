package Enthuware._10StreamsLambda.Lambda;

import java.util.Arrays;
import java.util.List;

public class Test4 {
   public static void main(String[] args) {
       List<String> list = Arrays.asList("Java", "C", "Python");
       boolean flag = list.stream()
                            .anyMatch(str -> {
                                System.out.println("Testing " + str);
                                return str.equals("C");
                            });
        System.out.println(flag);
   } 
}
