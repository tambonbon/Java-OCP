public class TurkeyCage implements AutoCloseable {
    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door NOT close");
    }

    public static void main(String[] args) {
        try (TurkeyCage t = new TurkeyCage()) {
            throw new IllegalStateException("Turkey ran off");
        } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
            for (Throwable throwable: e.getSuppressed()) 
                System.out.println("Suppressed: " +throwable.getMessage());
        }
    }
}
