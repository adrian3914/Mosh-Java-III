package ca.adrian.concurrency;

public class ThreadDemo {
    public static void show(){
        System.out.println(Thread.currentThread().getName());

        // CREATE A THREAD
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();


    }
}
