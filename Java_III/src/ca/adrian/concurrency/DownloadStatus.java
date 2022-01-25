package ca.adrian.concurrency;

import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private boolean isDone;
    private int totalBytes;
    private int totalFiles;


    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes(){
            totalBytes++;
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
