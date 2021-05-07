package Enthuware._04Generics;

public class Counter<T> {
    T t;
    // public <T> int count(T[] ta, T t) {
    //     this.t = t; // cannot convert T to T
    // }

    // #1: Use different names 
    public <P extends T> int count(P[] ta, P t) {
        this.t = t; // this.t is T, t is P, while P is-a T
        // t = this.t; // WRONG, CANT convert from T to P (always convert from right to left)
        return 0;
    }

    // #2: Not re-declare for the method
    public int count2(T[] ta, T t) {
        this.t = t; // now they are same type
        return 0;
    }
}
