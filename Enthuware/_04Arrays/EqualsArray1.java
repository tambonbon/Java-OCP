package Enthuware._04Arrays;

public class EqualsArray1 {
    public static void main(String[] args) {
        int[][] original = {{1,2,3}, {4,5,6,7}};
        int[][] duplicate = original.clone();
        int[] copy = duplicate[0].clone();

        System.out.println(original == duplicate); // false
        // because duplicate is a clone of orig ---> they point to 2 different array objects !!!
        // their elements however point to same objects
        System.out.println(original.equals(duplicate)); // false
        // because .equals method of array simply check whether 2 references point to same object or not
        // in other words, .equals same ==
        System.out.println(original[0] == duplicate[0]); // true
        // clone creates a shallow copy, so all elements are same
        System.out.println(duplicate[0] == copy); // false
        System.out.println(duplicate[0].equals(copy)); //false
    }
}
