package Chapter14.generics.puttingAllTogether;

import java.util.List;

import Chapter14.generics.puttingAllTogether.CombiningGeneric.A;
import Chapter14.generics.puttingAllTogether.CombiningGeneric.B;

public class PassingGeneric {
    <T> T first(List<? extends T> list) {
        return list.get(0);
    }

    <B extends A> void third(List<B> list) { }
    // <B extends A> ---> you want to use B as a type parameter just for this method,
    // and that it needs to extends the A class

    <T extends Object> B third2(List<? extends Object> list) {
        return new B();
    }
    void fourth(List<? super B> list) { }
}
