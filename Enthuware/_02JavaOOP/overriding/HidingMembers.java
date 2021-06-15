package Enthuware._02JavaOOP.overriding;

import java.util.Collections;
import java.util.List;

public class HidingMembers {
    static class Penguin {
        public static int getHeight() {
            return 3;
        }
        public void printInfo() {
            System.out.println(getHeight());
        }
    }

    static class CrestedPenguin extends Penguin {
        public static int getHeight() {
            return 8;
        }
        // public void printInfo() {
        //     System.out.println(getHeight());
        // }
        public static void main(String[] args) {
            new CrestedPenguin().printInfo(); // 3, not 8
        }
    }
}
