package Enthuware._02JavaOOA.nestedClasses;

public class OuterWorld {
    class InnerPeace {
        private String reason = "none";
        InnerPeace (String reason) {
            this.reason = reason;
        }
    }
    public InnerPeace i = new InnerPeace("none");
    public static void main(String[] args) {
        var inner = new OuterWorld().new InnerPeace("yoga"); // RIGHT
        var in    = new InnerPeace("yoga"); // WRONG
        var out   = new OuterWorld();
        System.out.println(out.i.reason); // RIGHT
        // Though reason is private field within InnerPeace,
        // InnerPeace itself is a member of OuterWorld 
        // ---> OuterWorld can access `reason`
    }
}
