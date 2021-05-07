package Enthuware._11Localization.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test1 {
    public static void main(String[] args) {
        // 1. Print full name of Month
        SimpleDateFormat sDateFormat = new SimpleDateFormat("MMMM", Locale.FRANCE);
        System.out.println(sDateFormat.format(new Date()));
        // 2. Print month number
        SimpleDateFormat sDateFormat2 = new SimpleDateFormat("M*", Locale.FRANCE);
        System.out.println(sDateFormat2.format(new Date()));
    } 
}
