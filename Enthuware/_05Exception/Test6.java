public class Test6 {
    public static void main(String[] args) {
        int j = 1;
        try {
            int i = doIt() / (j=2);
        } catch (Exception exception) {
            System.out.println("j = " + j); // j = 1
            // When computation of left-hand operand of a binary operator completes abrubtly (L.5)
            // ---> NO PART OF RIGHT-HAND OPERAND EVALUATED
            // ---> j=2 NEVER EXECUTED
        }
    }

    private static int doIt() throws Exception {
        throw new Exception("Forget it");
    }

} 