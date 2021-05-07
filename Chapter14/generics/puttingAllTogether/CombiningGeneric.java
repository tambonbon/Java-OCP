package Chapter14.generics.puttingAllTogether;

import java.util.ArrayList;
import java.util.List;

public class CombiningGeneric {
    static class A {}
    static class B extends A{}
    static class C extends B{}

    List<?> list1 = new ArrayList<B>();
    List<? extends A> list2 = new ArrayList<B>();
    // List<? extends B> list2 = new ArrayList<A>();
    
    List<? super A>   list3 = new ArrayList<A>();
    // List<? super A>   list3 = new ArrayList<B>();
    List<? super B> list5 = new ArrayList<A>();
    // List<? super B> list6 = new ArrayList<C>();

    // List<?> list6 = new ArrayList<? extends A>();
}
