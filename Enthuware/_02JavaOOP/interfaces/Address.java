package Enthuware._02JavaOOP.interfaces;

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

    public String getAdres(){ // If getAdres is static ---> invalid, static method CANT hide instance method from House
        return "R No 1, Home";
    }
}
public class Address {
    public static void main(String[] args) {
        House house = new HomeOffice();
        System.out.println(house.getAddress()); // R No 1, Home
        System.out.println(house.getAdres()); // R No 1, Home

        Office office = new HomeOffice();
        System.out.println(office.getAddress()); // R No 1, Home
        // System.out.println(office.getAdres()); // INVALID, bc getAdres is static
        System.out.println(Office.getAdres()); // R No 1, Home

        ((House)house).getAddress(); // 101 Smart Str
    }
}
