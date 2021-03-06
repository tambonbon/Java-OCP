package Enthuware._02JavaOOP.overriding;

public class CastClass1 {
    static class Super { }
    static class Sub extends Super { }
    public static void main(String[] args) {
        Super sup = new Super();
        Sub sub = new Sub();

        // valid cast
        sup = (Super) sub;

        // You don't need to cast this, because a sub always is-a sup
        sub = (Sub) sup;

        Super superr = new Sub();
        superr = (Sub) sub;

        superr = new Sub();
        superr = (Super) sub;

        sup = (Sub) superr;
    }
}
