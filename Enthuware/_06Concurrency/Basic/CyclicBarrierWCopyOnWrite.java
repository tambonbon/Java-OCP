package Enthuware._06Concurrency.Basic;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class CyclicBarrierWCopyOnWrite {
    public static void main(String[] args) throws Exception{
        List<Integer> list = new CopyOnWriteArrayList<>();

        /* 
        this ES creates a thread pool that re-uses a fixed (5) number of threads ...
        .. operating off a shared unbounded queue
         */
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        /* 
        CyclicBarrier is called "cyclic" because it can be re-used after waiting threads are released
         */
        CyclicBarrier cBarrier = new CyclicBarrier(2, () -> System.out.println("All done"));
        // here, it prints All done twice

        IntStream.range(0, 5).forEach(n -> executorService.execute(
            () -> {
                try {
                    list.add(n);
                    cBarrier.await();
                } catch (InterruptedException | BrokenBarrierException exception) {
                    System.out.println("Exception");
                }
            }
        ));
        /* 
        In the code, we submit 5 tasks to ES.
        Each task will be executed by a separate thread, and each thread will call cb.await().
        But as soon as the 2nd thread calls cb.await,
        the barrier will be released,
        and the Runnable given as the barrierAction will execute.
        The same thing happens for the 4th thread ----> All Done is printed twice
        However, when 5th thread calls cb.await(), barrier will close and will remain waiting ..
        .. and it gets hanged because no 6th thread to get the barrier release!

        If change to 6 threads and range(0,6) --> fine */
        executorService.shutdown();
    }
}
