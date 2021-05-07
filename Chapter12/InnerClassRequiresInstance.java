package Chapter12;

public class InnerClassRequiresInstance extends Fox {
    public static void main(String[] args) {
        // Den den = new Den();
    }
}

class Fox {
    public class Den {}
    public void goHome() {
        new Den();
    }
    public static void visitFriend() {
        Fox fox = new Fox();
        fox.new Den();
        // new Den(); NOT compile !
    }
    public void visitDen() {
        Den den = new Den();
    }
    
}

    class Squirrel extends Fox{
    public void visitFox() {
        new Den();
    }
}
