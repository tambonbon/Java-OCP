package Enthuware._02JavaOOA.interfaces;

public class Fruit extends Food implements Eatable {
    public static void main(String[] args) {
        // types = 30; // field types is ambiguous
        // System.out.println(types); // field types is ambiguous

        Eatable.types = 40; // cannot be assigned bc of final

        Food.types = 30;
        System.out.println(Food.types); // 30
    }
}

interface Eatable {
    int types = 10; // public static final
}

class Food implements Eatable {
    public static int types = 20;
}