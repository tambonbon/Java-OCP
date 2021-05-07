package Enthuware._06Concurrency.Basic;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(500);
        return "DONE";
    }
}
public class Test1 {
    public static void main(String[] args) throws Exception {
        var es = Executors.newSingleThreadExecutor();
        var future = es.submit(new MyCallable());
        System.out.println(future.get());
        es.shutdownNow();
        // shutDownNow stops all actively executing tasks, halts all waiting tasks,
        // and returns a list of tasks that WERE WAITING FOR EXECUTION
    }
}
