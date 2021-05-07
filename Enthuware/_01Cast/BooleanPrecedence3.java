package Enthuware._01Cast;

public class BooleanPrecedence3 {
    static boolean a, b, c;
    public static void main(String[] args) {
        
        boolean bool = (a = true) || (b = true) && (c = true);
        // if left operand of conditional "or" is true ---> not even try to evaluate the right side
        System.out.println(a +" " + b + " " + c);
        
    }

    public void name() {
        float t;
        System.out.println(t); // since t is local variable, it NOT have default value --> invalid
        System.out.println(a); // a is member variable --> default value
    }
}
