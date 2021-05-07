package Enthuware._02JavaOOA.nestedClasses;

public class Test2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.getInner().getOi());
    }
}

class Outer {
    private int oi = 20;

    class Inner {
        int getOi() { return oi; } 
        // object of an inner class has access to members within outer instance
    }

    Inner getInner() { return new Inner(); }
}
