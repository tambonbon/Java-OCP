package Enthuware._04CollectionAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListCopyOf {
    
    
    public static void main(String[] args) {
        Collection<Number> col = new HashSet<>();
        col.add(1);
        /* 
        `of` accepts either an array or multiple individual params.
        If pass it a collection, it will be treated as regular object,
        i.e. `of` will return a list/set containing the same collection object,
        instead of returning a list/set containing the objects that the passed collection contains */
        var list1 = List.of(col);
        col.add(2);
        System.out.println(list1); // [[1 2]]
        /* 
        copyOf accepts only a Collection
        it iterates through passed COllections,
        and adds all elements of that Collection in the returned list/set */
        var list2 = List.copyOf(col);    
        col.add(3);
        System.out.println(list1+" " + list2); // [[1,2,3]], [1,2]

        /* 
        HOWEVER, this situation DIFFERS !!!
        bc list.of is referring to an array, not a collection 
        ----> stay immutable regardless what changed in array 
        */
        var numA = new Integer[]{1,2};
        var list3 = List.of(numA);
        numA[0] = 2;
        var list4 = List.copyOf(list3);
        System.out.println( list3 + " "+ list4); // [1,2] [1,2]

        /* 
        the situation DIFFERS again in this case
         */
        var numB = new Integer[]{1,2};
        var list5 = new ArrayList<Integer>(List.of(numB));
        list5.add(null);
        System.out.println(list5); //[1, 2, null]
        var list6 = Collections.unmodifiableCollection(list5);
        System.out.println(list6); // [1, 2, null]
        // even though list6 is unmodifiable..
        // ..  when change an element of underlying list (list5) ..
        // .. list6 also changes
        list5.set(2, 3);
        System.out.println(list5); // [1, 2, 3]
        System.out.println(list6); // [1, 2, 3]

        var list7 = List.of(list5, list6);
        System.out.println(list7); //[[1, 2, 3], [1, 2, 3]]
    }
}

class AnotherExample { 
    public static void main(String[] args) {
        Collection c = new ArrayList<>();
        saveObject(c);    

var tes  = new Integer("1");
var test = Integer.parseInt("1");
var test2 = Integer.valueOf("1");
        
    }



static Object prevObject;
public static void saveObject(Collection<? extends Object> e) { // need to be Collection here
    prevObject = e;
} 
}
