package Enthuware._04Generics;

import java.util.ArrayList;
import java.util.List;

public class RealBrainer1 {
    public static <E extends CharSequence> List<? super E> doIt (List<E> num) {
        //          ^^^^^^^^^^^^^^^^^^^^^       ^^^^^^^^^^        ^^^^^^^
        //       like a requirement for E       generics           generics

        // doIt takes a List<E>, where E has to be some class extending CharSequence,
        // ---> List<String>, List<CharSequence>, or ArrayList<String> work 
        // output type is List<? super E>
        // so if input is ArrayList<String>, E will be a String;
        // HOWEVER,
        // once the method returns, there's no way to know what is the exact class
        // of objects stored in the return List
        // ---> CANT declare any particular class, not even Object
        // ----> ONLY WAY: either use non-typed reference type i.e. List,
        // or, use same type as return type mentioned in method signature
        // i.e. List<? super String> ,
        // bc E will be bound to String
        return null;

        // other explaination:
        // The issue is that the object returned by doIt method would be a typed List.
        // A typed list should only be allowed to store objects that belong to that type.
        // But List<Object> can store any object. 
        // So if you assign the return value to List<Object>,
        // you could circumvent the restriction on that List. 
        //The compiler prevents you from that 
        // by refusing to assign a typed list to List<Object>. 
    }
    
    public static void main(String[] args) {
        ArrayList<String> in = new ArrayList<>();
        var result = doIt(in);
    }
    ArrayList<CharSequence> test = new ArrayList<>();
}
