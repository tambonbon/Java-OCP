import java.io.IOException;

public class Suppressed1 implements AutoCloseable {
    String header = null;

    public Suppressed1(String name) throws IOException {
        header = name;
        if ("D2".equals(name)) throw new IOException("Unknown");
        System.out.println(header + "Opened");
    }
    public String readString() throws IOException {
        return "";
    }
    public void close() {
        System.out.println("Closing device " + header);
        throw new RuntimeException("RTE while closing " + header);
    }
    public static void main(String[] args) throws Exception{
        try (Suppressed1 sup1 = new Suppressed1("D1"); 
                Suppressed1 sup2 = new Suppressed1("D2")) {
            throw new Exception("test");
            // D1 is created (and closed) successfully, but an IOException is thrown while createing D2
            // ---> control never enters try block (L.19), and L.21 never executed
            // Any exception that is thrown while CLOSING the resrc ---> in suppressed exceptions 
        } 
        /* Result:
        D1Opened
        Closing device D1       
        Exception in thread "main" java.io.IOException: Unknown
        at Suppressed1.<init>(Suppressed1.java:8)
        at Suppressed1.main(Suppressed1.java:20)
        Suppressed: java.lang.RuntimeException: RTE while closing D1
                at Suppressed1.close(Suppressed1.java:16)
                at Suppressed1.main(Suppressed1.java:22)
                 */
        // catch (Exception e) {
        // }
    }
}
