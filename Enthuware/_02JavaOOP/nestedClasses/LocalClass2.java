package Enthuware._02JavaOOP.nestedClasses;

public class LocalClass2 {
    static int val = 10;

    public static int reduce(int val) {
        class Inner {
            public int reduce(int innerVal) {
                return innerVal - val; // INVALID
                // Local Variable MUST BE FINAL/EFFECTIVELY FINAL !!!
            }
        }
        //  val--; // INVALID TOO
         return new Inner().reduce(val);
    }

    public static void main(String[] args) {
        reduce(5);
        System.out.println(val); // 10 if val is made to effective final
    }
}
