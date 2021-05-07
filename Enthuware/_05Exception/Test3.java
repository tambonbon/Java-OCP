public class Test3 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("1");
            throw new NullPointerException(); // this exception is NOT thrown inside catch
                // -----> WILL NEVER BE CAUGHT BY ANY OF REMAINING CATCH BLOCKS !! <-----
        } catch (NullPointerException nullPointerException) {
            System.out.println("2");
            return;
        } catch (Exception exception){
            System.out.println("3");
        } finally {
            System.out.println("4");
        }
        System.out.println("END"); // WILL NEVER EXECUTED bc NEVER REACHED
    }

    private static void m1() {
        System.out.println("m1 starts");
        throw new IndexOutOfBoundsException("Big Bang");
    }
    
}
