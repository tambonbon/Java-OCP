package Enthuware._01Primitive;

public class ExceptionParsing1 {
    public static float parseFloat(String string) {
        try {
            return Float.parseFloat(string);
        } catch (NumberFormatException exception) {
            return 0.0f;
        } catch (IllegalArgumentException exception) { // this exception defends the program itself
            return Float.NaN;
        }
    }

    public static void main(String[] args) {
        System.out.println(parseFloat("string")); // 0.0
        // "string" is not a valid float number ---> throw a NumberFormatException
        
        System.out.println(parseFloat("-Infinity")); // -Infinity

        System.out.println(parseFloat(""+ Float.NEGATIVE_INFINITY)); // -Infinity

        System.out.println(parseFloat("NaN"));
    }
}
