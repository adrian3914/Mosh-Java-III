package ca.adrian.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show(){
        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

       for(Thread thread: threads){
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

/*
     // CONFINEMENT, THREADS are not modifying the same object, since each has the different objects
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();


        // start 10 threads simultaneously
        for (int i = 0; i < 10; i++) {
            var task = new DownloadFileTask();
            tasks.add(task);

            Thread thread = new Thread(task);
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

        var totalBytes = tasks.stream()
                .map(t -> t.getStatus().getTotalBytes())
                .reduce(Integer::sum);

        System.out.println(totalBytes);

 */

/*
    // THREAD SIGNALLING USING wait() and notify()
     var status = new DownloadStatus();

        Thread thread1 = new Thread(new DownloadFileTask(status));

        Thread thread2 = new Thread(() -> {
            while (!status.isDone()){
                synchronized (status){
                    try {
                        status.wait();// this will make this thread to sleep until notify by another thread that status object has changed
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(status.getTotalBytes());
        });

        thread1.start();
        thread2.start();
 */