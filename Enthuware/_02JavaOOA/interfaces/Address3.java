package Enthuware._02JavaOOA.interfaces;

public class Address3 {
    static interface House {
        public default void lockTheGates() {
            System.out.println("Locking House");
        }
    }

    static interface Office extends House {
        public void lockTheGates();
    }

    static class HomeOffice implements House, Office { 
        // Invalid declaration..
        // Java NOT permit a class to inherit multiple versions of the same method..
        // .. from multiple UNRELATED interfaces

        // Even if Office extends House..
        // .. it NOT compile because HomeOffice needs to implement Office.lockTheGates

        // If Office NOT extends House and declare default lockTheGates..
        // .. --> duplicate default error
        // FIX: make Office extends House
        // ---> result is from Office.lockTheGates

        /**
         * 1. If Office NOT extends House 
         *      a. If Office.lockTheGates NOT default --> L14 INVALID, default method conflicts 
         *      b. If Office.lockTheGates default ---> L14 INVALID, duplicate default
         *      c. If Office.lockTheFates static ---> valid, but might result from error later
         * 2. If Office extends House
         *      a. If Office.lockTheGates NOT default 
         *          i. If HomeOffice NOT implement lockTheGates ---> L14 INVALID, must implement abstract Office.lockTheGates
         *          ii. If HomeOffice implements lockTheGates ---> valid 
         *      b. If Office.lockTheGates default ---> valid
         *      c. If Office.lockTheGates static ---> L11 INVALID, static method cannot hide instance method from House
         *          i. If House.lockTheGates static ---> valid
         * */

    }

    public static void main(String[] args) {
        Office office = new HomeOffice();
        office.lockTheGates();
    }
}
