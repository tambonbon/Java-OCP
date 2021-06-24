package Enthuware._01String;

public class AppendReplaceString {
    public static void main(String[] args) {
        String s = "bloop";
        // s.append("whooper"); // invalid, String NOT have append, ONLY concat

        replaceString(s);
        System.out.println(s); // bloop

        s = s.replace('b', 'c');
        System.out.println(s); // cloop

        /* Why is it different?
        ---> Because java is pass-by-value <---
         */
    }

    static void replaceString(String s) {
        s = s.replace('b', 'c');
    }
    
}
