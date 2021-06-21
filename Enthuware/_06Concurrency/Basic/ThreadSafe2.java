package Enthuware._06Concurrency.Basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadSafe2 {
    static int count = 0;

    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i = 0; i <5; i++) {
            es.submit( () -> {
                for (int j = 0; j < 5000; j++) {
                    ThreadSafe2.count++;
                }
            });
        }
        es.awaitTermination(10,, TimeUnit.SECONDS);
        es.shutdownNow();
        System.out.println(count);
    }

    /** Remarks:
     * count is NOT THREAD SAFE!!!
     * - How to make `count` thread safe?
     * 1. 
     * ```
     * synchronized(ThreadSafe2.class) { ThreadSafe2.count++}
     * ```
     * 2. Use AtomicInteger
     * ```
     * AtomicInteger count = AtomicInteger(0)
     * ```
     */
}
