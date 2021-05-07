package Enthuware._04CollectionAPI;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RealBrainer1 {
    public static void main(String[] args) {
        /* 
        This is a valid declaration,
        however, it will NOT allow you to put anything into map1,
        bc map1 takes an Object key and instance of 'Unknown class' as value
        ---> compiler NOT know that 'class' is what ---> NOT allow ---> map1 is read-only
        If it was Map<Object, Object> map1 ... ---> fine
        Remarks: in this case, compiler looks only at the reference type of variable,
        although actual object pointed to by `map1` is of type LinkedHashMap<Object,Object>
         */
        Map<Object, ?> map1 = new LinkedHashMap<Object, Object>();
        
        /* 
        map2 takes an Object key, and an instance of 
        'a class that is' either ArrayList or a superclass of ArrayList as value
        ---> value can be an instance of ArrayList or its SUBCLASS
        HOWEVER, CANT put Object (which is a superclass) in the map,
        bc compiler NOT know the exact superclass `map2` can take 
        since it could be anything, from AbstractList, to Object, or any other superclass of AL
        Compiler only knows that it is a superclass but NOT the exact type
        */
        Map<Object, ? super ArrayList> map2 = new LinkedHashMap<Object, ArrayList>();

        // putting ArrayList works fine
        map2.put(1, new ArrayList<>());
        // also for a subclass of ArrayList 
        class MyList<E> extends ArrayList<E> { }
        map2.put(1, new MyList<>()); 
        
        // BUT, an Object or any other objects are NOT allowed
        map2.put(1, new Object());
        map2.put(1, "hello");
        
        /* 
        Keys in TreeMap MUST be mutually comparable
        So, the code compiles, but will throw RT exception (ClassCastException) */
        Map map3 = new TreeMap();
        Map<Object, Object> map4 = new TreeMap<Object, Object>();
        map4.put("1", "hello");
        map4.put(1, new Object());
        map4.put(1.0, new ArrayList());

        

    }
    
}

