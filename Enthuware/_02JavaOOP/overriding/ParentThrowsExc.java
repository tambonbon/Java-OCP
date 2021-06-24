package Enthuware._02JavaOOP.overriding;

public class ParentThrowsExc {
    
    static class Game {
        public void play() throws Exception { // this declares Exception ..
            // .. even though overidding `play` in l14 declares Exception..
            // .. but main method NOT declare Exception ---> NOT compile
            // If it was RuntimeException --> fine
            System.out.println("Playing...");
        }
    }

    static class Soccer extends Game {
        @Override
        public void play() throws Exception {
            System.out.println("Playing Soccer...");
        }

        public static void main(String[] args) {
            Game g = new Soccer();
            g.play();
        }
    }
}
