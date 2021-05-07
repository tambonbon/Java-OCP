package Enthuware._03Structure.loops;

public class Loop1 {
    int k = 5;
    public boolean checkIt(int k) { // this k shadows instance variable k..
        return k-- > 0 ? true : false;
        // .. --> any change to k in this method will NOT change instance variable k..
    }

    public void printThem() {
        while(checkIt(k)) { // .. in this method, k refers to instance variable ..
            System.out.println(k--); // if sysout(k) ---> infinite loop of k | if sysout(--k) -> 4321
            // .. thus, need to reduce it by 1 after each iteration
        }
    }
     
    public static void main(String[] args) {
        new Loop1().printThem(); // 54321
    }
}
