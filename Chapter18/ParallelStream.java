import java.util.List;

public class ParallelStream {
    private static int doWork(int input) { // pretend this might be calling a db or reading a file
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        return input;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List.of(1,2,3,4,5)
            .stream()
            .map(w -> doWork(w))
            .forEach(s -> System.out.print(s + " "));
        System.out.println();
        var timeTaken = (System.currentTimeMillis() - start)/1000;
        System.out.println("Time: " + timeTaken);

        long startParallel = System.currentTimeMillis();
        List.of(1,2,3,4,5)
            .parallelStream()
            .map(w -> doWork(w))
            .forEach(s -> System.out.print(s + " "));
        System.out.println();
        var timeTakenParallel = (System.currentTimeMillis() - startParallel)/1000;
        System.out.println("Time: " + timeTakenParallel);
    }
}
