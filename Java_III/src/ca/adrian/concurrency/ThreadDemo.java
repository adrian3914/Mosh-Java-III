package ca.adrian.concurrency;

public class ThreadDemo {
    public static void show(){
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
