package Enthuware._03Structure.loops;

public class WhileAssign {
    // test while
    public void looper () {
        var x = 0;
        while ( (x = 5) != 0) { // be careful by the ( ), here x=5 is assigned first
            for (int m = 10; m >=0; m--) {
                x = m;
            }
        }
    }
}
