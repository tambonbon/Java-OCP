package Enthuware._01String;

public class Concat {
    public static void main(String[] args) {
        System.out.println(1 + 2 + "3"); // 33 = (1+2)+"3"
        System.out.println("1" + 2 + 3); // 123 = ("1"+2)+3 

        System.out.println(4 + 1.0f); // 5.0 , NOT 5.0f

        System.out.println('a' + 1); // 98 = 97+1 (promoted to int)
    }
}
