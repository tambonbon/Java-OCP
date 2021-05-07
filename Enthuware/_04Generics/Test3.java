package Enthuware._04Generics;
class Booby { }
class Dooby extends Booby {}
class Tooby extends Dooby {}

public class Test3 {
    List<? super Booby> bV = null;
    // this implies bV must point to a List of some superclasses of Booby
    // ---> could be a List of Booby, or Object
    // although we are never sure which class that is,
    // we can ALWAYS add a Booby or its subclass object to this List
    // bc we know that object will satisfy the is-a relation with Booby, Object
    // On the other hand, if we take any object out of this,
    // we are NEVER sure the type of that object, other than being Object
    // -----> whoever uses bV, expect to be able to add any Booby object to the list 

    List<? extends Tooby> tV = null;
    // this implies tV must point to a List of objects that satisfies is-a relation with Tooby
    // ---> could be a List of Tooby, or some other classes extending Tooby
    // although we are never sure which class that is,
    // we can NEVER add any object to this list
    // On the other hand, if we take any object out of this, 
    // it ALWAYS "is-a" Tooby, so we can take out any object from it and assign type Tooby
    // ----> whoever uses tV, expect to retrieve Tooby (& its subclasses) objects
    
}