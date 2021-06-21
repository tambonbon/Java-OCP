package Enthuware._11Localization.DateTime;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;

public class DateFormatCantInstantiate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateFormat df = new DateFormat(DateFormat.LONG); // INVALID

        DateFormat dateFormat = DateFormat.getDateInstance(); // this the right way

        /* 
        java.text.DateFormat class provides several static getXXXInstance methods. 
        The following are the important methods that you need to know for the exam:  
        1. static DateFormat getDateInstance()            
            Get a default date/time formatter that uses the SHORT style for both the date and the time. 
        2. static DateFormat getDateInstance(int style)            
            Gets the date formatter with the given formatting style for the default locale. 
        3. static DateFormat getDateInstance(int style, Locale aLocale)           
             Gets the date formatter with the given formatting style for the given locale. 
        4. static DateFormat getInstance()            
            Get a default date/time formatter that uses the default style for both the date and the time.  
            
        Note that valid styles values are : DateFormat.DEFAULT, DateFormat.FULL, DateFormat.LONG, DateFormat.MEDIUM, and DateFormat.SHORT */
    }
}
