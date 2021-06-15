package Enthuware._02JavaOOP.interfaces;

public class Test5 {
    interface Account {
        public default String getId() {
            return "0000";
        }
    }

    interface PremiumAccount extends Account {
        static String getIdNotOverride() {
            return "1111";
        }

        static String getId() {
            return "1111"; // this static method CANT hide instance method from interface Account
        }

        /**
         * Trying to override a static method with a non-static method (and vice versa)
         * will result in compilation error
         *  */

         default String getId() {
             return "1111";
         }
    }
}
