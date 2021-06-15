package Enthuware._01String;

public class ConcatNull {
    
    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd'};

        String newStr = null;
        for (char ch : myCharArr) {
            newStr = newStr + ch;
        }

        System.out.println( myStr == newStr); // false
        System.out.println( myStr.equals(newStr)); // false

        System.out.println(newStr); // nullgood

        /**
         * Since newStr is null at the beginning..
         * .. the first iteration assigns "nullg"
         * Had newStr been defined as String newStr = "" ---> false true
         */
    }
}
