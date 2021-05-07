package Enthuware._02JavaOOA.encapsulation.b;

import Enthuware._02JavaOOA.encapsulation.a.Movable;

public class Donkey implements Movable{
    public int location = 200; 
    public void move(int by) {
        location += by;
    }
    public void moveBack(int by) {
       location -= by; 
    }
}
