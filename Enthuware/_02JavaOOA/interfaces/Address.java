package Enthuware._02JavaOOA.interfaces;

interface House {
    public default String getAddress() {
        return "101 Main Str";
    }
    public default String getAdres() {
        return "101 Main Str";
    }
}

interface Office {
    public default String getAddress() {
        return "101 Smart Str";
    }
    public static String getAdres() { // NOTE: static
        return "101 Smart Str";
    }
}

class HomeOffice implements House, Office {
    public String getAddress() {
        return "R No 1, Home";
    }
    // If no getAddress method here ---> fail to compile..
    // because the class will now have 2 different implementations
    // of same method and compiler NOT know which method to invoke

    public static String getAdres(){
        return "R No 1, Home";
    }
}
public class Address {
    public static void main(String[] args) {
        House house = new HomeOffice();
        System.out.println(house.getAddress());
        System.out.println(house.getAdres());

        Office office = new HomeOffice();
        System.out.println(office.getAddress());
        // System.out.println(office.getAdres()); // INVALID, bc getAdres is static
        System.out.println(Office.getAdres());
    }
}
