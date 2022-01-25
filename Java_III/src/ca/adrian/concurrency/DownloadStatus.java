package ca.adrian.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private boolean isDone;
    private AtomicInteger totalBytes = new AtomicInteger();
    private int totalFiles;
    private Object totalBytesLock = new Object();

    public int getTotalBytes() {
        return totalBytes.get();
    }

    public void incrementTotalBytes(){
            totalBytes.incrementAndGet(); // ++a
    }

    public void incrementTotalFiles(){
            totalFiles++;
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
