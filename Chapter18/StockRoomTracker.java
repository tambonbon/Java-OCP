import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class StockRoomTracker {
    public static void await(CyclicBarrier cb) {
        try {
            cb.await();
        } catch (Exception exception) {}
    }

    public static void main(String[] args) {
        var cb = new CyclicBarrier(1, () -> System.out.println("Stock Room Full!"));
        IntStream.iterate(1, i -> 1).limit(11).parallel().forEach(i -> await(cb));
    }
}
