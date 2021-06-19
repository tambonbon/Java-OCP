package Enthuware._02JavaOOP.overriding;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemberSelectionStatic2 {
    
    static class Super {
        static String ID = "QBANK";
    }

    static class Sub extends Super {
        static {
            System.out.println("In Sub");
        }
    }

    public static void main(String[] args) {
        System.out.println(Sub.ID); // QBANK

        assertEquals(Super.ID, "QBANK");
    }
}
