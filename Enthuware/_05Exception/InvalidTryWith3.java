import java.io.IOException;

public class InvalidTryWith3 implements AutoCloseable {
    boolean open = false;
    int index;

    public InvalidTryWith3(int index) {
        this.index = index;
        open = true;
    }

    public void write() throws IOException {
        throw new RuntimeException("Cant write");
    }

    public void close() {
        open = false;
        System.out.println("Device closed " + index);
    }

    public static void main(String[] args) {
        InvalidTryWith3 d1 = new InvalidTryWith3(1);
        try (d1;
            InvalidTryWith3 d2 = new InvalidTryWith3(2);
            InvalidTryWith3 d3 = new InvalidTryWith3(3)) {
                d2.write();
                d1.close();
        } catch (Exception e) {
            System.out.println("Got exception " + e.getMessage());
        }
    }
}
