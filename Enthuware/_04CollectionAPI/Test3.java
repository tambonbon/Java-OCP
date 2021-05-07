ppackage Enthuware._04CollectionAPI;

import java.util.ArrayList;
import java.util.List;

interface Birdy {
    void fly();
}

interface Birdie extends Birdy {
    void eat();
}

class Dino implements Birdie {
    @Override
    public void eat() {
        System.out.println("Dino eats");
    }
    @Override
    public void fly() {
        System.out.println("Dino flies");
    }
}
class Bino implements Birdie {
    @Override
    public void eat() {
        System.out.println("Bino eats");
    }
    @Override
    public void fly() {
        System.out.println("Bino flies");
    }
}
public class Test3 {
    public static void main(String[] args) {
        // m is of type Birdie, which has 2 abstract methods fly and eat
        List<Birdie> m = new ArrayList<>();
        m.add(new Dino());
        m.add(new Bino());
        for (Birdie b : m) {
            b.fly();
            b.eat();
        }
        System.out.println("---");
 
        // n is of type Birdy, which has 1 abstract method fly
        List<Birdy> n = new ArrayList<>();
        n.add(new Dino());
        n.add(new Bino());
        for (Birdy b : n) {
            b.fly();
        }
        System.out.println("---");

        // o is of type Dino
        List<Dino> o = new ArrayList<>();
        o.add(new Dino());
        for (Birdie birdie : o) { // this works, convert from Dino to Birdie
            birdie.fly();
        }
        System.out.println("---");

        // List<Birdie> p = new ArrayList<>();
        // m.add(new Dino());
        // m.add(new Bino());
        // for (Dino b : p) { // error, CANT convert from Birdie to Dino
        //     b.fly();
        //     b.eat();
        // } 
    }
}
