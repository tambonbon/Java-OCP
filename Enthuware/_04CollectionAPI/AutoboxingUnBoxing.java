package Enthuware._04CollectionAPI;

import java.util.List;
import java.util.OptionalInt;

public class AutoboxingUnBoxing {

    static class Autoboxing{
         public static void main(String[] args) {
            // valid autoboxing:
            Integer i = 10;
            // Integer getVal() { return 2; }
            System.out.println(2+""); // 2 will first be boxed into an Integer object..
            // .. then that Integer object will be used to produce String "2"
            // --> which will then be concatenated with ""
            // ---> valid autoboxing
            List.of(1,2,3); // valid autoboxing
            
            // invalid autoboxing:
            Long l = Long.valueOf(300);
            // no autoboxing happening because valueOf returns a Long, not long !!!
        }
    }

    static class Unboxing {
        public static void main(String[] args) {
            // valid unboxing
            long lv = Integer.valueOf(10);

            // int ival = ;
        }
    }
}
