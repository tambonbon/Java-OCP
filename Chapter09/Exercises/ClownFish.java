package Chapter09.Exercises;

interface Aquatic {
    int getNum(int p);
}
public class ClownFish implements Aquatic {
    String getNum() {return "14";}
    public int getNum(int input) {return 15;}
    public static void main(String[] args) {
        System.out.println(new ClownFish().getNum(-1));
    }
}