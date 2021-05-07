package Chapter14.generics.genericMethods;

import Chapter14.generics.genericInterfaces.Robot;

/* 
* When class generics + method generics
* ---> generics are independent */
public class Crate<T> { // T is Robot
    public <T> T tricky(T t) { // T is String
        return t;
    }

    public static String createName() {
        Crate<Robot> crate = new Crate<>(); // T from l8 is Robot
        return crate.tricky("bot");         // T from l9 is String
    }
}
