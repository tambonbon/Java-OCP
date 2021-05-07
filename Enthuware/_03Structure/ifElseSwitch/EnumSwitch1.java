package Enthuware._03Structure.ifElseSwitch;

import java.time.LocalDate;
import static java.time.DayOfWeek.*;

public class EnumSwitch1 {
    public static void main(String[] args) {
        var day = LocalDate.now().with(SATURDAY).getDayOfWeek();

        switch (day) { // alow usage of enum in switch
            case MONDAY: // case. DayOfWeek.MONDAY is INVALID
            TUESDAY: // these are just labels, not switch cases
            WEDNESDAY:
            THURSDAY:
            FRIDAY: System.out.println("working"); // this belongs to case MONDAY
            case SATURDAY:
            SUNDAY: System.out.println("off");
        }
    }
}
