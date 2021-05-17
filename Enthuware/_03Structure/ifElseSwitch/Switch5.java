package Enthuware._03Structure.ifElseSwitch;

public class Switch5 {
    public static void main(String[] args) {
        var ca = new char[]{'a', 'b', 'c', 'd'};
        var i = 0;
        for (var c : ca) {
            switch(c) {
                case 'a' : i++;
                case 'b' : i++; // no difference between i++ and ++i here
                case 'c'|'d' : i++;
                // 'c'|'d' is the result of bitwise OR operation on 'c' and 'd'
                // this case will be executed when value of c matched the value of bitwise OR of 'c' and 'd'
                // ... which is actually  character 'g' !!!
            }
        }
        System.out.println("i = " + i);
    }
}
