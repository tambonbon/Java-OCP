package Chapter18;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManager {
    private int sheepCount = 0;
    private static int sheepCountStatic = 0;
    private void incrementReport() {
        // System.out.println((++sheepCount));
        System.out.println((sheepCount++));
    }
     private void incrementReportStatic() {
        System.out.println((++sheepCountStatic));
    }
    private void incrementReportSync() {
        synchronized(this) {
            System.out.println((++sheepCount) + " ");
        }
    }
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++) {
                service.submit(() -> manager.incrementReport());
            } 
            System.out.println("---");
            for (int i = 0; i < 10; i++) {
                service.submit(() -> manager.incrementReportStatic());
            } 
            System.out.println("---");
            for (int i = 0; i < 10; i++) {
                service.submit(() -> manager.incrementReportSync());
            }
        }   finally {
                if (service != null) service.shutdown();
            }
    }
}

