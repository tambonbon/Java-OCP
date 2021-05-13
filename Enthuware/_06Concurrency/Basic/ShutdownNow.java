package Enthuware._06Concurrency.Basic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ShutdownNow {
    static class MyCall implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(50000);
            return "DONE";
        }
    }
     public static void main(String[] args) throws Exception {
         ExecutorService executorService = Executors.newSingleThreadExecutor();
         Future future = executorService.submit(new MyCall());
         System.out.println(future.get()); // this will block until there's a value to return, or exception
         // ---> the program will block at here, and will print the return of MyCall i.e. DONE
         executorService.shutdownNow();
         // this stops all actively executing tasks, halts process of waiting task, ..
         // .. and return a list of the tasks that were awaiting execution
         // .. it NOT wait for actively executing tasks to terminate..
         //.. awaitTermination to do that
     }
}
