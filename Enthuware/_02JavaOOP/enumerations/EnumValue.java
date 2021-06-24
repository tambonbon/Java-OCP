package Enthuware._02JavaOOP.enumerations;

import java.util.ArrayList;
import java.util.List;

public class EnumValue {
    
    enum Card {
        HEART, CLUB, SPADE, DIAMOND;
    }

    public static void main(String[] args) {
        for (var i = 0; i<4; i++) {
            System.out.println(Card.values()[i]);
        }
        // ^^ which is equivalent to:
        for (var c : Card.values()) System.out.println(c);

        List<?> list = new ArrayList<Integer>();
    }
}
