package Enthuware._02JavaOOA.overriden;

class Super {
    public int getNumber(int a) {
        return 2;
    }
}

public class SubClassOverloading extends Super{
    public int getNumber(int a, char ch) {
        return 4;
    }    

    public static void main(String[] args) {
        System.out.println(new SubClassOverloading().getNumber(4));
        // compiler still smart enough to recognize getNumber is in Super
    }
}
