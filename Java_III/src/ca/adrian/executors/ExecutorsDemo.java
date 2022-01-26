package ca.adrian.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorsDemo {

    public static void show(){
        // CREATE A THREAD POOL -> Using Executors static factory methods
        var executor = Executors.newFixedThreadPool(2);
        try {
            // checking what class is instantiate at runTime
            System.out.println(executor.getClass().getName());

            // Passing a task
            executor.submit(() ->{
                // print the name of the current thread
                System.out.println(Thread.currentThread().getName());
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            // CLOSE EXECUTOR TO TERMINATE THE PROGRAM
            executor.shutdown();
        }
    }
}
