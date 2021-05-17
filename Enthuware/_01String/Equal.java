package Enthuware._01String;

public class Equal {
    public static void main(String[] args) {
        String exam = "OCP Java 11"; // OCP Java 11 goes into the pool of string 
        String unique = new String(exam); // this NOT go into pool of string because NOT a string literal
        String interned = unique.intern(); // if the string literal is in pool already -> return that..
        // .. otherwise, return a new string 

        System.out.println(
            (exam == unique) + " " +  // false
            (exam == interned) + " " + // true
            (unique == interned) // false
        );


    }
}
