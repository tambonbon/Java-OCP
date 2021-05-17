package Enthuware._05Exception;

public class Suppressed3 {
    public static void m1() throws Exception {
        throw new Exception("Exception from m1");
    }
    public static void m2() throws Exception {
        try {
            m1();
        } catch (Exception e) {
            throw e;
        }
        finally {
            throw new RuntimeException("Exception from finally");
        }
    }

    public static void main(String[] args) {
        try {
            m2();
            // m2 throws an exception EXPLICITLY from its catch&finally block
            // ---> the one thrown in finally block is the one thrown from the method <------ !!!
            // iotw, the one thrown in catch block: LOST (not added to suppressed)
        } catch (Exception e) {
            Throwable[] ta = e.getSuppressed();
            for (Throwable throwable : ta) {
                System.out.println(throwable.getMessage());  
            }
            e.printStackTrace();
        }
    }
    
}
