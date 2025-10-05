package com.talant.heapsort.cli;

import com.talant.heapsort.algorithms.HeapSort;
import com.talant.heapsort.metrics.PerformanceTracker;
import java.util.Random;

public class BenchmarkRunner {

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000}; 
        Random rand = new Random();

        for (int n : sizes) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = rand.nextInt(n * 10);
            }

            HeapSort heapSort = new HeapSort();
            PerformanceTracker tracker = new PerformanceTracker();

            tracker.start();
            heapSort.sort(arr);
            tracker.stop();

            tracker.setComparisons(heapSort.getComparisons());
            tracker.setSwaps(heapSort.getSwaps());

            System.out.println("Array size: " + n);
            System.out.println("Time (ns): " + tracker.getElapsedTime());
            System.out.println("Comparisons: " + tracker.getComparisons());
            System.out.println("Swaps: " + tracker.getSwaps());
            System.out.println("-----------------------------");
        }
    }
}


