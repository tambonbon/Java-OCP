package Enthuware._02JavaOOA.overriden;

public class CastClass2 {
    static class A {
        public int getCode() { return 2;}
    }

    static class AA extends A {
        public void doStuff() { }
    }

    public static void main(String[] args) {
        A a = null;
        AA aa = null;

        // Valid codes:
        aa = (AA) a;
        a = aa;
        a = (AA) aa;
        ((AA)a).doStuff();

        // Invalid codes:
        aa = a;
    }
}
