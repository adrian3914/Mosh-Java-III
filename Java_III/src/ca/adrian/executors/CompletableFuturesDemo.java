package ca.adrian.executors;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

    public static void show(){
       // COMBINING COMPLETABLE FUTURE
        // 2 tasks async in different threads combining the result.

        var first = CompletableFuture
                .supplyAsync(() -> "20USD")
                .thenApply(str -> {
                    String price = str.replace("USD", "");
                    return Integer.parseInt(price);
                });

        var second =CompletableFuture.supplyAsync(() -> 0.9);

        // Combining Result
        first
                .thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
                .thenAccept((n) -> System.out.println(n));
    }
}

/*
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
 */

/*
      // CREATING A ASYNCHRONOUS API
        var service  = new MailService();
        service.sendAsync();

        System.out.println("Hello World.");

        // Since we do see it since it is a console app
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
 */


/*
     // RUNNING CODE ON COMPLETION
        var future = CompletableFuture.supplyAsync(() -> 1);
        future.thenRunAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Done");
        });

        future.thenAcceptAsync( n -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(n);
        });

        // This will run in the main thread
        future.thenAccept( n -> System.out.println(n));
        future.thenRun(() -> System.out.println("Hello"));

 */

/*
     // HANDLING EXCEPTIONS
       var future = CompletableFuture.supplyAsync(() -> {
           System.out.println("Getting the current weather");
           throw new IllegalStateException(); // we wont see the exception since it is thrown in another thread.
       });

       // to see exception in Main thread we must call get() Future interface
        try {
            var temperature = future.exceptionally(ex -> 1).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
 */

/*
     // TRANSFORMING A COMPLETABLE FUTURE
    public static int toFahrenheit(int celsius){
        return (int)(celsius * 1.8) + 32;
    }
    public static void show(){
        var future  = CompletableFuture.supplyAsync(() -> 20);
        future
                .thenApply(CompletableFuturesDemo::toFahrenheit) // map c -> f
                .thenAccept(f -> System.out.println(f)); // accept result and sys out

    }
 */

/*
        // COMPOSING COMPLETABLE FUTURES
    public static CompletableFuture<String> getUserEmailAsync(){
        return CompletableFuture.supplyAsync(() -> "email");// query database
    }

    public static CompletableFuture<String> getPlayListAsync(String email){
        return CompletableFuture.supplyAsync(() -> "playlist");
    }

    public static void show(){
        // email -> playlist
        getUserEmailAsync()
                .thenCompose(CompletableFuturesDemo::getPlayListAsync)
                .thenAccept(playlist -> System.out.println(playlist));
    }
 */
