package Chapter18;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LionPenManager {
    private void removeLions() { System.out.println("Removing Lions");}
    private void cleanPen() { System.out.println("Cleaning the pen");}
    private void addLions() {
        System.out.println("Adding Lions");
    }
    public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
        try {
            removeLions();
            c1.await();
            cleanPen();
            c2.await();
            addLions();
        } catch (InterruptedException | BrokenBarrierException e) {
            //Handle checked excep here
        }
        
    }

    public void name() {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("zebra", 2);
        map.put("elephant", 6);
        System.out.println(map.get("elephant"));

        Set<String> gardenAnimals = new ConcurrentSkipListSet<>();
        gardenAnimals.add("rabbit");
        gardenAnimals.add("gopher");
        System.out.println(gardenAnimals.stream().collect(Collectors.joining(","))); // gopher, rabbit


    }


    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            var manager = new LionPenManager();
            var c1 = new CyclicBarrier(4, 
                () -> System.out.println("*** Lions removed!"));
            var c2 = new CyclicBarrier(4,
                () -> System.out.println("*** Pen cleaned!"));
            for (int i = 0; i < 4; i++) {
                service.submit(() -> manager.performTask(c1, c2));
            }
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
