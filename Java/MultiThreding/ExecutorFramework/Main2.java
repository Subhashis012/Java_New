package Java.MultiThreding.ExecutorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class Main2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> future = executorService.submit(() -> System.out.println("Hello")); // runnable parameter
        System.out.println(future.get()); // blocking call ( null )
        if (future.isDone()) {
            System.out.println("Task is done !");
        }
        executorService.shutdown();
    }

    public static class VolatileCounter {
        private AtomicInteger counter = new AtomicInteger(0);

        public void increment() {
            counter.incrementAndGet();
        }

        public int getCounter() {
            return counter.get();
        }

        public static void main(String[] args) throws InterruptedException {
            VolatileCounter vc = new VolatileCounter();
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    vc.increment();
                }
            });
            Thread t2 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    vc.increment();
                }
            });
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println(vc.getCounter());
        }
    }
}
