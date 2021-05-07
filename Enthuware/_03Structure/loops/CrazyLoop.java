package Enthuware._03Structure.loops;

public class CrazyLoop {
    public static void main(String[] args) {
        var c = 0;
        JACK: while (c < 8) {
            JILL: System.out.println(c);
            if (c > 3) break JILL; // INVALID, label JILL is missing 
            // break JILL is valid only when it is within the block of code..
            // .. under the scope of the label JILL
            // If there's a block, like JILL: { .... break JILL; else c++} then it works
            else c++; 
        }
    }
}
