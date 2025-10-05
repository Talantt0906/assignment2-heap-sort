package com.talant.heapsort.algorithms;

public class HeapSort {
    private int comparisons = 0; 
    private int swaps = 0;       
    
    public void sort(int[] arr) {
        int n = arr.length;

        
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

        private void heapify(int[] arr, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int left = 2 * rootIndex + 1;
        int right = 2 * rootIndex + 2;

        
        if (left < heapSize) {
            comparisons++;
            if (arr[left] > arr[largest]) {
                largest = left;
            }
        }

        
        if (right < heapSize) {
            comparisons++;
            if (arr[right] > arr[largest]) {
                largest = right;
            }
        }

        
        if (largest != rootIndex) {
            swap(arr, rootIndex, largest);
            heapify(arr, heapSize, largest);
        }
    }

    
    private void swap(int[] arr, int i, int j) {
        swaps++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
    public int getComparisons() {
        return comparisons;
    }

    
    public int getSwaps() {
        return swaps;
    }

    
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nComparisons: " + heapSort.getComparisons());
        System.out.println("Swaps: " + heapSort.getSwaps());
    }
}

