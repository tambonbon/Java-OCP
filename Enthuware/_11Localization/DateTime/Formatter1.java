package Enthuware._11Localization.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Formatter1 {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("eeee");
        LocalDate date = LocalDate.of(2000, 1, 1); // assume it was Saturday on this date
        System.out.println(df.format(date)); // SATURDAY
        //                 ^^        ^^^^
        //       DateTimeFormatter   LocalDate
    }
}
