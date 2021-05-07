package Enthuware._02JavaOOA.enumerations;

import java.util.List;

enum Cafe{
    ESPRESSO("VERY STRONG"), MOCHA("BOLD"), LATTE("MILD");
    private String strength;
    private Cafe(String strength) { this.strength = strength; }
    @Override
    public String toString() {
        return String.valueOf(strength);
    }
}

public class Coffee {
    public static void main(String[] args) {
        List.of(Cafe.values()) // return array
            .stream()
            .forEach(e -> {
                System.out.println(e.name() +":" +e +", ");
            });

        Cafe cafe = Cafe.MOCHA;
        if (cafe == Cafe.ESPRESSO) System.out.println("");

        switch(cafe) {
            case ESPRESSO: System.out.println(""); break; 
            // within switch, enum MUST be the unqualified name ---> NO Cafe.ESPRESSO
        }

        for (var i = 0; i < Cafe.values().length; i++) {
            System.out.println(Cafe.values());
        }
    }
}
