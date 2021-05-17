package Enthuware._03Structure.loops;

public class Loop2 {
    int INT1 = 1;
    int INT2 = 2;
    public static void main(String[] args) {
        int i = 0, j = 0;
        X1: for (i = 0; i < 3; i++) {
            X2: for(j = 3; j > 0; j--) {
                System.out.println(i + " " + j);
                if (i < j) continue X2;
                else break X1;
            }
        }
        /**
         * 1. If if(i < j) continue X1; else break X2 
         * ---> make sure X2 NOT iterate more than once
         * -----> for each iteration of i, j only takes value of 3, then terminates
        *   0 3
            1 3
            2 3
            3 3
         * 2. If if(i < j) continue X2 else break X2
            0 3
            0 2
            0 1
            1 3
            1 2
            1 1
            2 3
            2 2
            3 2
         */
        System.out.println(i + " " + j);
    }
}
