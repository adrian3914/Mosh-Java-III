package ca.adrian.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class ExecutorsDemo {
    public static void show(){
        // CREATING A COMPLETABLE FUTURE
        Runnable task  = () -> System.out.println("a");
        var future = CompletableFuture.runAsync(task);

    }
}

/*
        // CREATE A THREAD POOL -> Using Executors static factory methods
        var executor = Executors.newFixedThreadPool(2);
    try {
            // Passing a task to the thread pool
            executor.submit(() ->{
                // print the name of the current thread
                System.out.println(Thread.currentThread().getName());
            });
        }
        finally {
            // CLOSE EXECUTOR TO TERMINATE THE PROGRAM
            executor.shutdown();
        }
 */

/*
    // CALLABLE AND FUTURES
        var executor  = Executors.newFixedThreadPool(2);

        try {
            // passing a future task -> it will take sometime to get result
            var future = executor.submit(() -> {
                LongTask.simulate();
                return 1;
            });

            System.out.println("Do more work");
            var result = future.get(); // Main thread has to wait until the result is ready, block method
            System.out.println(result);

        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
 */
