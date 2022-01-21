package ca.adrian.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
    private Lock lock = new ReentrantLock();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes(){
        lock.lock();
        try {
            totalBytes++;
        }
        finally {
            lock.unlock(); // always put unlock in the finally block in case there is an exception, so we can unlock
        }
    }
}
