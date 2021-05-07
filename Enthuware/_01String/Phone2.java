package Enthuware._01String;

public class Phone2 {
    public static String hidePhone1(String fullPhoneNumber) {
        return new StringBuilder(fullPhoneNumber).substring(0, 8) + "xxxx";
    }
    public static String hidePhone2(String fullPhoneNumber) {
        return new StringBuilder(fullPhoneNumber).replace(0, 8, "xxxx").toString();
    }   
    public static String hidePhone3(String fullPhoneNumber) {
        return new StringBuilder("xxxx").insert(0, fullPhoneNumber, 0, 8).toString()
    }
    public static String hidePhone4(String fullPhoneNumber) {
        return new StringBuilder(fullPhoneNumber).append("xxxx",8, 12).toString();
        // IndexOutOfBoundsExcep because the call to append will look for characters..
        // .. starting from index 8 to 11 in string "xxxx", which has only 4 characters
    }
}
