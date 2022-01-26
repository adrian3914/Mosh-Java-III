package ca.adrian.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

public class ExecutorsDemo {
    public static void show(){
        // CREATING A COMPLETABLE FUTURE OBJECT
        Runnable task  = () -> System.out.println("a");
        Supplier<Integer> supplier = () -> 1;

        var future1 = CompletableFuture.runAsync(task); // does not return a value
        var future2 = CompletableFuture.supplyAsync(supplier); // returns a value

        try {
            var result = future2.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
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
