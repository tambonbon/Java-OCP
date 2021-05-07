package Enthuware._03Structure.loops;

public class IncrementInWhile {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        do {
            if (count % 3 == 0) continue;
            sum += count; // sum of 1 2 4 5 7 8 10 11
        }
        while (count++ < 11); // count++ means count is first compared to 11..
        // .. and based on this comparison a decision is made, and then incremented
        //  So when count=10, condition 10<11 is true (meaning loop needs to execute again)..
        // .. and count is increment to 11
    }
}
