package Enthuware._04CollectionAPI;

import java.util.List;

class Booby { }
class Dooby extends Booby {}
class Tooby extends Dooby {}
public class Test2 {
    Booby b = new Booby();
    Tooby t = new Tooby();

    public void do1(List<? super Dooby> dList) { // need a superclass of dooby, or dooby itself
        dList.add(t);
    }
    // tooby is a subclass of dooby
    // ---> tooby is-a dooby, or tooby is-a any-super-class-of-dooby

    public void do2(List<? extends Dooby> dList) {
        dList.add(t);
    }
}
