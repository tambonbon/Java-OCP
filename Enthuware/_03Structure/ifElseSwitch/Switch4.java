package Enthuware._03Structure.ifElseSwitch;

public class Switch4 {
    public static void main(String[] args) {
        var k = 9;
        var s = 5;
        switch(k) {
            default :
            if (k == 10) { s = s*2;} // this if belongs to default
            else {
                s = s + 4;
                break;
            }
            // case 9 : s = s + 3;
        }
        System.out.println(s);
    }
}
