package Java.MultiThreding.ExecutorFramework;

import java.util.concurrent.*;

public class Main3 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(() -> System.out.println("Task executed after 5 seconds delay"), 5,
                5,
                TimeUnit.SECONDS);

        scheduler.schedule(() -> {
            System.out.println("Initiating Shutdown...");
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);
        // scheduler.shutdown();
    }
}
