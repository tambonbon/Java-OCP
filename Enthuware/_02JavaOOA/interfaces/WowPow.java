package Enthuware._02JavaOOA.interfaces;

public class WowPow  {
    interface Pow {
        static void wow() {
            System.out.println("In Pow.wow");
        }
    }

    static abstract class Wow {
        static void wow() {
            System.out.println("In Wow.wow");
        }
        // static method CANT be overriden !!!
    }

    static class PowWow extends Wow implements Pow {
        public static void main(String[] args) {
            PowWow f = new PowWow();
            f.wow(); // In Wow.wow 
            // f is reference variable of type PowWow,
            // Since PowWow extends Wow, PowWow inherits static method wow() from Wow
            // Java allows static method of a class to be invoked using reference variable,
            // and so f.wow() invokes Wow's wow()
            Pow.wow(); // if want to invoke static method of an interface
        }
    }
}
