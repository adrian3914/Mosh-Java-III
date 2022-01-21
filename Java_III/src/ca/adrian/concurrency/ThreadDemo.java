package ca.adrian.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show(){
        // RACE CONDITION
        // Showing the total bytes we have downloaded so far
        var status  = new DownloadStatus();

        // List of threads
        List<Thread> threads = new ArrayList<>();

        // start 10 threads simultaneously
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread); // adding to List<Thread>
        }

        // Thread safe -> safe calling a method with join(), -> if one thread is calling it, the other will wait until finished
        for(var thread: threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(status.getTotalBytes());

    }
}

/*
     System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 10; i++){
            // CREATE A THREAD
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
 */

/*
     // JOINING THREADS
        // Downloading a file
       Thread thread = new Thread(new DownloadFileTask());
       thread.start();

       // We want to scan for virus after download is complete in a separate thread
        try {
            // we tell the current thread to wait for the completion of another thread, while waiting it cannot do other things
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("File is ready to be scanned");
 */

/*
     // INTERRUPTING A THREAD
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Cancelling the thread -> sends a thread interruption request
        thread.interrupt();
 */