package Enthuware._01Primitive;

public class WrapObject {
    public static Integer wiggle(Integer x) {
        Integer y = x + 10;
        x++;
        System.out.println(x);
        return y;
    }

    public static void main(String[] args) {
        Integer dataWrapper = Integer.valueOf(5);
        Integer value = wiggle(dataWrapper);
        System.out.println("dataWrapper = " + dataWrapper + " value = " + value);
        System.out.println("add when both operands are not numeric = " + dataWrapper+value);
        System.out.print("add when both operands are numeric = ");
        System.out.println(dataWrapper+value);

        // inside wiggle, dataWrapper, then a parameter, is incremented and print as 6, ..
        // .. while calling dataWrapper itself prints 5 --> NOT changed
        // Wrapper objects are always immutable
    }
}
