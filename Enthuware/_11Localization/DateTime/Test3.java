package Enthuware._11Localization.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test3 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(new Date()));
        /* Question:
        How to initialize a SimpleDateFormat so the above code print full time zone of the given date? 
        */

        sdf = new SimpleDateFormat("zzzz", Locale.CANADA_FRENCH); // z: Time zone name
        System.out.println(sdf.format(new Date()));
    }
}
