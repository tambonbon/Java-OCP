package Enthuware._11Localization.DateTime;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;

public class Test2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date2 = LocalDate.of(2020, Month.OCTOBER, 20);
        // DateFormat dateFormat = new DateFormat(DateFormat.LONG); // INVALID, DateFormat is interface

        DateFormat dateFormat2 = DateFormat.getDateInstance();
        
        System.out.println(dateFormat2.format(date)); // RTE, IllegalArgumentException: Cant format
    }
}
