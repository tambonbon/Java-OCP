package Enthuware._04Arrays;

public class Test1 {
    public static void main(String[] args) {
        var i = 0;
        int[] array = {10, 20};
        array[i] = i = 30;
        // array[i] = i = 30 ---> array[0] = i = 30 ---> i = 30; array[0] = i ---> array[0] = 30
        System.out.println(array[0] + " " + array[1] + " " + i); //30 20 30

        Integer[] arrayIntegers = {10};
        System.out.print(array.length);
    }
}
