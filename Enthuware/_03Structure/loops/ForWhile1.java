package Enthuware._03Structure.loops;

public class ForWhile1 {
    public static void main(String[] args) {
        int x  = 0;
        A: for (var i = 10; i < 10; i--) { // i is initialized to 10, but condition is < 10 -> never get inside loop
            var j = 0;
            B: while (j < 10) {
                if (j > i) break B;
                if (i == j) {
                    x++;
                    continue A;
                }
                j++;
            }
            x--;
        }
        System.err.println(x);
    }
}
