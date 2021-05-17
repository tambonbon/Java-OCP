package Enthuware._02JavaOOA.interfaces;

public class Speak {
    public static void main(String[] args) {
        Speak speak = new GoodSpeak();
        ((GoodSpeak)speak).up();
        ((Tone)speak).up();
        ((Tone)(GoodSpeak)speak).up(); 

        // speak.up(); // WRONG, Speak NOT implement up
    }
}

class GoodSpeak extends Speak implements Tone {
    @Override
    public void up() {
        System.out.println("Up up up");
    }
}

interface Tone {
    void up();
}