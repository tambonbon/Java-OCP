package Enthuware._01String;

public class Phone1 {
    public static String hidePhone(String fullPhoneNumber) {
        return new StringBuilder("xxx-xxx") + fullPhoneNumber.substring(8);
    }

    public static void main(String[] args) {
        System.out.println(hidePhone("0987065409"));
    }
}
