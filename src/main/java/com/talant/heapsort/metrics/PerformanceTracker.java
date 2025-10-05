package com.talant.heapsort.metrics;

public class PerformanceTracker {
    private long startTime;
    private long endTime;
    private int comparisons = 0;
    private int swaps = 0;

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        endTime = System.nanoTime();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public void setComparisons(int comparisons) {
        this.comparisons = comparisons;
    }

    public int getComparisons() {
        return comparisons;
    }

    public void setSwaps(int swaps) {
        this.swaps = swaps;
    }

    public int getSwaps() {
        return swaps;
    }
}

