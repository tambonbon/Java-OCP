package Enthuware._03Structure.loops;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 1; int j = 10;
        int k = 1;
        do {
            System.out.println("Iteration "+k + ": i= " + i + " j= " +j);
            k++;
            if (i++ > --j) continue;
            // System.out.println("Iteration "+k + " after if: i= " + i + " j= " +j);
        } while (i < 5);
        System.out.println("i = " + i + " j= " + j);

        i = 1;
        j = 10; k = 1;

        while (i < 5) {
            System.out.println("Iteration "+k + ": i= " + i + " j= " +j);
            k++;
            if (i++ > --j) continue; 
        }
        System.out.println("i = " + i + " j= " + j);

    }
}
