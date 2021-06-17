package Enthuware._01String;

public class StringEqual {
    public static void main(String[] args) {
        System.out.println("String".replace('g', 'G') == "String".replace('g', 'G')); // false
        // replace creates a new string object

        System.out.println("String".replace('g', 'g') == "String"); // true
        // replace returns same object if there's no change
    }
}
