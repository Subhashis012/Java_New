package Java.MultiThreding;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CF {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "ok";
        });
        try {
            try {
                String s = completableFuture.get();
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread started");
    }
}
