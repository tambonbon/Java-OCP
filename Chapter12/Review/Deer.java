package Chapter12.Review;

public class Deer {
    enum Food {APPLES, BERRIES, GRASS}
    protected class Diet {
        private Food getFav() {
            return Food.BERRIES;
        }
    }
    public static void main(String[] args) {
        Deer deer = new Deer();
        switch(deer.new Diet().getFav()) {
            case APPLES: System.out.println("a");
            case BERRIES: System.out.println("b");
            default: System.out.println("c");
        }
    }
}
