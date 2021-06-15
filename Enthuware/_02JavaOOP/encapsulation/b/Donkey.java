package Enthuware._02JavaOOP.encapsulation.b;

import Enthuware._02JavaOOP.encapsulation.a.Movable;

public class Donkey implements Movable{
    public int location = 200; 
    public void move(int by) {
        location += by;
    }
    public void moveBack(int by) {
       location -= by; 
    }
}
