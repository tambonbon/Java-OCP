package Chapter14.generics.genericMethods;

import Chapter14.generics.genericClasses.Crate;

public class Handler {
    public static <T> void prepare(T t) { // before the return type 
                                          // ---> declare formal type param, <T>
        System.out.println("Preparing " + t);
    }

    public static <T> Crate<T> ship(T t) { // generic param in return type, Crate<T>
        System.out.println("Shipping " + t);
        return new Crate<T>();
    }
}
