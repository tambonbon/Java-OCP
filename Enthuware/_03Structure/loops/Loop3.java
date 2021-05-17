package Enthuware._03Structure.loops;

public class Loop3 {
    static int INT1 =1, INT2 = 3;
    public static void main(String[] args) {
        for(var i = INT1; i < INT2; i++) {
            System.out.println(i);
        } // 1 2

        for(int i = INT1; i < INT2; System.out.println(++i)); // 2 3
    }

}
