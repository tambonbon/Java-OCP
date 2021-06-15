package Enthuware._02JavaOOP.overriding;

import java.util.Observable;
import java.util.Observer;

public class CastClass4 {
    
    static class A implements Runnable { 
        @Override
        public void run() {
        }
    }
    
    static class B extends A implements Observer { 
        @Override
        public void update(Observable o, Object arg) {
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        // valid casts:
        Object o = a; Runnable runnable = (Runnable) o;
        // Although you know that o refers to an object that is a Runnable at runtime..
        // .. compiler NOT know about it
        // ---> you have to cast explicitly, telling the compiler o refers to Runnable object

        Object o2 = b; Runnable runnable2 = (Runnable) b;
        // since b is declared of a type that indirectly implements Runnable..
        // .. compiler can figure out b will always point to object assignable to Runnable
        // --> explicit cast is not required here!

        runnable2 = a; // still fine without cast
        runnable2 = b;
        Observer observer = b; 

        // invalid casts
        runnable = o; // CANT convert from Object to Runnable
        // though at runtime, o points to a Runnable..
        // .. compiler NOT know about it

        Object o3 = b; Observer observer2 = o3; // CANT convert from Object to Observer
    }
}
