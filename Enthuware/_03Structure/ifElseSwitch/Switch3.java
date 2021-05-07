package Enthuware._03Structure.ifElseSwitch;

public class Switch3 {
    public static void main(String[] args) {
        char i; // char is also an integral data type which can take any integer value from 0 to 2^16-1
        // integer 0,1,... NOT same as char '0', '1',....
        // so when i == 0, nothing gets printed, and i is incremented to 1 (due to i++)
        // i is then incremented again by for loop --> i = 2
        // when i = 2, "C" is printed, and i incremented to 3 (due to i++)
        // and then i incremented to 4 by for loop so i becomes 4
        // when i = 4, "E" is printed, 
        // and since there's no break --> fall through 'E' --> "F" printed
        LOOP: for (i = 0; i<5; i++) {
            switch(++i) { // if change to ++i ----> B
                case '0': System.out.println("A");
                case 1  : System.out.println("B"); break LOOP;
                case 2  : System.out.println("C"); break;
                case 3  : System.out.println("D"); break;
                case 4  : System.out.println("E"); 
                case 'E': System.out.println("F");
            }
        }
    }
}
