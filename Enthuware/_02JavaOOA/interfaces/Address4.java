package Enthuware._02JavaOOA.interfaces;

public class Address4 {
    static interface House {
        public default void lockTheGates() {
            System.out.println("Locking House");
        }
    }

    static interface Office {
        public void lockTheGates();
    }

    static class HomeOffice implements House, Office { 
        /* 
        HomeOffice MUST implement lockTheGate to prevent from ambiguity
         */
        @Override
        public void lockTheGates() {
            System.out.println("Locking HomeOffice");
        }
    }

    public static void main(String[] args) {
        Office office = new HomeOffice();
        office.lockTheGates(); // Locking HomeOffice

        House home = (House) office; // works fine, even though Office NOT extends House
        home.lockTheGates(); // Locking HomeOffice
    }
}
