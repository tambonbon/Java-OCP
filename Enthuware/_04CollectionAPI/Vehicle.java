package Enthuware._04CollectionAPI;

import java.util.ArrayList;
import java.util.List;

abstract class Vehicle { }
interface Drivable{}
class Car extends Vehicle implements Drivable {}
class SUV extends Car {}

class Test {
    public static void main(String[] args) {
        ArrayList<SUV> al3 = new ArrayList<>();
        Vehicle v1 = al3.get(0);
        Drivable d1 = al3.get(0);
        Car c1 = al3.get(0);

        ArrayList<Car> al4 = new ArrayList<>();
        Vehicle v2 = al4.get(0);
        Drivable d2 = al4.get(0);
        SUV s2 = (SUV) al4.get(0);
        SUV s3 = al4.get(0);

        ArrayList<Vehicle> al5 = new ArrayList<>();
        Car c3 = (Car) al5.get(0);
    }

    Car car = new Car();
    SUV LandRover = new SUV();
    Vehicle vehicle = new Vehicle(){
        
    };
    public void do1(List<? extends Car> list) { // a list of some variety of Car
        // you CANT put any kind of car in this
        // say, you want to put a LandRover, but what if it's a list of Chevrolet?
        // likewise, if it's a list of Chevrolet, you cannot just put a vehicle in it,
        // because what if that vehicle is a helicopter?
        list.add(vehicle);        
        
        // surely, when you pick an element from that list of car,
        Car normalCar = list.get(0); 
        // you get a car, or a vehicle, or anything that you can drive
        Vehicle hVehicle = list.get(0);

        // likewise, when you pick an element from a list of car,
       SUV Chevrolet = list.get(0); 
       // you might not get a Chevrolet, as what if it's a list of Land Rover?
       // so no Chevrolet in it
       // you need to cast it to SUV
       SUV Audi = (SUV) list.get(0); 
    }

    public void do2(List<? super Car> list) { // a list of something of which Car is a kind
        // surely, you CAN put any kind of car in this
        // say, a LandRover is certainly a kind a Car of
        list.add(car);
        list.add(LandRover);
        // but for sure, a vehicle (say, a helicopter) is NOT a kind a Car of
        list.add(vehicle);

        // when you want to pick an element from that list of Car
        Car normalCar = list.get(0);
        // you might not get a car, or SUV indeed, because it can be a list of a Flying Car
        SUV Chevrolet =  list.get(0);
        
        // likewise, when you pick an element from that list of Car
        Vehicle hVehicle = list.get(0);
        // you might not get a vehicle, as what if the list contains a String?
        // so even no vehicle in it
        // you need to cast it to vehicle/suv/anything...
        Vehicle hVehicle2 = (Vehicle) list.get(0);
        
        // an Object is the only one that holds true
        Object object = list.get(0);
    }

    public void do3(List<? super Vehicle> list) {
        list.add(car);
    }
}

