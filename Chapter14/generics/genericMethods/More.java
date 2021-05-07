package Chapter14.generics.genericMethods;

public class More {
    public static <T> void printStuff() { }
    public static <T> T    identity(T t) { return t;}
}
