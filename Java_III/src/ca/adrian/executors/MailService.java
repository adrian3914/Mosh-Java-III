package ca.adrian.executors;

import java.util.concurrent.CompletableFuture;

public class MailService {

    // Synchronous method | blocking
    public void send(){
        LongTask.simulate(); // simulating waiting period
        System.out.println("Mail was sent.");
    }

    // Asynchronous method to run asynchronous method as asynchronous
    public CompletableFuture<Void> sendAsync(){
        return CompletableFuture.runAsync(
                () -> send() // -> will be executed in a separate thread in the common thread pool
        );
    }
}
