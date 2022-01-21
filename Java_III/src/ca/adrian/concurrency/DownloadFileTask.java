package ca.adrian.concurrency;

public class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        // pausing the thread .sleep()
        try {
            Thread.sleep(5000); // 5sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}
