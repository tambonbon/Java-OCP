package Enthuware._02JavaOOA.interfaces;

public class Test3 {
    static class Super {
        static { 
            System.out.println("super");
        }
    }

    static class One {
        static {
            System.out.println("one");
        }
    }

    static class Two extends Super {
        static {
            System.out.println("two");
        }
    }

    public static void main(String[] args) {
        One one = null;
        Two two = new Two();
        // Super will be instantiated before Two
    }
}
