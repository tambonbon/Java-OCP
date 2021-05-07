package Enthuware._06Concurrency.Basic;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        Runnable r = () -> { System.out.println("In Runnable"); };
        Callable c = () -> { System.out.println("In Callable"); return 0; };

        var es = Executors.newCachedThreadPool();
        // Create a thread pool creating new threads as needed 
        // but will reuse previously constructed threads when available
        es.submit(c);
        es.submit(r);

        es.shutdown();
    }
}
