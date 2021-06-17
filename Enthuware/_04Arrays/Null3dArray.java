package Enthuware._04Arrays;

public class Null3dArray {
    public static void main(String[] args) {
        String[][][] arr = {
            {
                {"a", "b", "c"},
                {"d", "e", null}
            },
            {
                {"x"},
                null
            },
            {
                {"y"}
            },
            {
                { } // valid code !
            }
        };

        System.out.println(arr[0][1][2]); // null
        System.out.println(arr[2][0][0]); // y
        System.out.println(arr[3][0][0]); // NPE
    }
}
