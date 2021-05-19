package Enthuware._02JavaOOA.fieldsMethods;

public class Holder {
    int value = 1;
    Holder link;

    public Holder(int val) { this.value = val;}

    public static void main(String[] args) {
        final var a = new Holder(5);
        var b = new Holder(10);

        // a.link = b;
        // b.link = setIt(a,b);

        b.link = a; // uncomment this to prevent NPE
        a.link = setIt(a, b);
        System.out.println(a.link.value + " " + b.link.value); // throws NPE
        System.out.println(a.link); // null
        System.err.println(b.link); // some object
        /**
         * When setIt() executes, x.link = y.link, x.link becomes null...
         * ... because y.link is null
         */

         b.link = new Holder(2);
         System.out.println(b.link);
    }

    public static Holder setIt(final Holder x, final Holder y) {
        x.link = y.link;
        return x;
        
        // y.link = x.link;
        // return y; 
    }
}
