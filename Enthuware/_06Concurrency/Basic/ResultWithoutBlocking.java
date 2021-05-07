package Enthuware._06Concurrency.Basic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultWithoutBlocking {
    public static void main(String[] args) throws Exception {
        // create a thread pool of two threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        MyTask task1 = new MyTask();
        Future<String> result = executorService.submit(task1);
        
        System.out.println("Proceeding without blocking...");

        while (!result.isDone()) {
            try {
                // check later
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        System.out.println("Result is " + result.get());
        executorService.shutdown();
    }

    public static class MyTask implements Callable<String> {
        @Override
        public String call() throws Exception {
            try {
                // simulate a long running task
                Thread.sleep(2000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            return "Data from " + Thread.currentThread().getName();
        }
    }
}

