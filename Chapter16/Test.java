public class Test {
    static String j = "";
    public static void method(int i) {
        try {
            if (i ==2) {
                throw new Exception();
            }
            j += "1";
        } catch (Exception e) {
            j += "2";
            // return;
        } finally {
            j += "3";
        }
        j += 4;
    }
    
    public static float parseFloat(String string) {
        float f = 0.0f;
        try {
            f = Float.valueOf(string).floatValue();
            return f;
        } catch (NumberFormatException nfe) {
            f = Float.NaN;
            return f;
        }
    }

    public static void main(String[] args) {
        method(1);
        method(2);
        System.out.println(j);
        System.out.println( parseFloat("0.0"));
    }
}
