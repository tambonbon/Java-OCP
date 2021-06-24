package Enthuware._03Structure.ifElseSwitch;

public class DuplicateBooleanInIf {
    public static void main(String[] args) {
        var flag = true;
        if (flag = false) {
            System.out.println(1);
        } else if (flag) {
            System.out.println(2);
        }
        else if (!flag) {
            System.out.println(3); // this works! print 3
        }
        else System.out.println(4);
    }
}
