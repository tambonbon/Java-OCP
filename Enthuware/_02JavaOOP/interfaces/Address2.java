package Enthuware._02JavaOOP.interfaces;

public class Address2 {
    public static void main(String[] args) {
        House house = new MyHouse();
        System.out.println(house.getAddress()); // 101 Smart Str
    }
    
    static class MyHouse implements Office, House {
        // @Override
        // public String getAddress() {
        //     return "101 Big Str";
        // }
     }

    static interface House {
        public default String getAddress() {
            return "101 Main Str";
        }
    }

    static interface Office extends House {
        // Perfectly valid for a subinterface to override a default method of base interface
        public default String getAddress() {
            return "101 Smart Str";
        }

    }

}