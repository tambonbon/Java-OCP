package Enthuware._02JavaOOP.overriding;

public class Polymorphism4 {
    static class Game {
        public void play() throws Exception {
            System.out.println("Playing Games...");
        }
    }

    static class Soccer extends Game {
        public void play(String ball) {
            System.out.println("Playing Soccer with " + ball);
        }
    }

    public static void main(String[] args) throws Exception {
        Game game = new Soccer();
        // Valid codes:
        game.play();

        // Invalid codes:
        // game.play("ball")   ; // Invalid because the object refered-to by game is of class Soccer ..
        //.. the reference type is Game, which have no play(String)

        Soccer soccer = (Soccer) game; // downcast to Soccer, invalid without the cast
        // Valid codes:
        soccer.play(); 
        soccer.play("ball"); // soccer is of type Soccer, which defines play(String)
    }
}
