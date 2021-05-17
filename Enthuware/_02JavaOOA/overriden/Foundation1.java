package Enthuware._02JavaOOA.overriden;

import java.util.ArrayList;

public class Foundation1 {
    public static void main(String[] args) {
        List students = new ArrayList<>();
     // ^^^^                ^^^^^^^^^
     // reference type      object type
     /* 
     Since you are doing new AL, you are creating an object of class ArrayList
     You are assigning this object to variable students,
     which is declared of class List.
     Reference type means the declared type of the variable */
    }
}
