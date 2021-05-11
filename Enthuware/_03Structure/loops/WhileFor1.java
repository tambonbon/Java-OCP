package Enthuware._03Structure.loops;

public class WhileFor1 {
    private int j;
    void show() {
        while (j <= 5) {
            for (int j = 1; j < 5; ) { // j in for loop != j in instance member
                System.out.println(j + " ");
                j++;
            }
            j++; // 
        }
    }
}
