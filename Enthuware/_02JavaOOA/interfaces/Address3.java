package Enthuware._02JavaOOA.interfaces;

public class Address3 {
    static interface House {
        public default void lockTheGates() {
            System.out.println("Locking House");
        }
    }

    static interface Office {
        public void lockTheGates();
    }

    static class HomeOffice implements House, Office { 
        // Invalid declaration..
        // Java NOT permit a class to inherit multiple versions of the same method..
        // .. from multiple UNRELATED interfaces
        // Even if Office extends House..
        // .. it NOT compile because HomeOffice needs to implement Office.lockTheGates
    }

    public static void main(String[] args) {
        Office office = new HomeOffice();
        office.lockTheGates();
    }
}
