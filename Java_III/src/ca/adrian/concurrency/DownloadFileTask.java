package ca.adrian.concurrency;

public class DownloadFileTask implements Runnable{
    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        for (int i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted())
                return;
            status.incrementTotalBytes();
        }
        status.done();
        // notify() must be in a synchronized block if not throws IllegalMonitorStateException
        synchronized (status){
            status.notifyAll(); // notifying the all threads state of status obj has changed
        }
        System.out.println("Download complete: " + Thread.currentThread().getName());
    }

    private void pausingAThread(int milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public DownloadStatus getStatus() {
        return status;
    }

}
