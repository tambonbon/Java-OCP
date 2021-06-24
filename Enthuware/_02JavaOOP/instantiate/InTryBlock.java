package Enthuware._02JavaOOP.instantiate;

public class InTryBlock {
    public static void main(String[] args) {
        try {
            int i = 0;
            i = Integer.parseInt("1");
            System.out.println(i);
        } catch (NumberFormatException exception) {
            System.out.println(i); // wrong
        }
    }
}
