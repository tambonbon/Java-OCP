package Enthuware._02JavaOOA.interfaces;

interface Boiler {
    public void boil();
    private static void log(String msg) {
        System.out.println(msg);
    }
    public static void shutdown() {
        log("shutting down");
    }
}

interface Vaporizer extends Boiler {
    public default void vaporizer() {
        boil();
        System.out.println("Vaporized!");
    }
}
public class Reactor implements Vaporizer {
    public void boil() {
        System.out.println("Boiling...");
    }

    public static void main(String[] args) {
        Vaporizer v = new Reactor(); // CANT convert if Reactor NOT implements Vaporizer
        v.boil();
        v.vaporizer();
        Boiler.shutdown();
    }
}
