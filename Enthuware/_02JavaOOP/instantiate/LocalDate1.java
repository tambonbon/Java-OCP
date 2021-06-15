package Enthuware._02JavaOOP.instantiate;

import java.time.LocalDate;

public class LocalDate1 {
    public static void main(String[] args) {
        /* 
        LocalDate class is immutable
         */
        LocalDate d1 = LocalDate.now(); // object #1
        d1.plusDays(10); // #2, as #1 is immutable
        LocalDate d2 = d1.minusWeeks(1); #3
        d1 = null; // no object created here !!!
        LocalDate d3 = LocalDate.now().plusDays(3).plusMonths(1).minusYears(3); // #4, #5, #6
        d2.plusWeeks(5); // #7
        d1 = d2; //no object created here !!!
    }
}
