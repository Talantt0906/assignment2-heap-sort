package com.talant.heapsort;

import com.talant.heapsort.algorithms.HeapSort;
import org.junit.Test;
import static org.junit.Assert.*;

public class HeapSortTest {

    @Test
    public void testSort() {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);
        int[] expected = {1,2,3,4,5,7,8,10};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);
        assertEquals(0, arr.length);
    }

    @Test
    public void testSingleElement() {
        int[] arr = {42};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    public void testDuplicates() {
        int[] arr = {3, 1, 2, 3, 1};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);
        assertArrayEquals(new int[]{1,1,2,3,3}, arr);
    }

    @Test
    public void testReverseSorted() {
        int[] arr = {5,4,3,2,1};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);
        assertArrayEquals(new int[]{1,2,3,4,5}, arr);
    }

    @Test
    public void testNearlySorted() {
        int[] arr = {1,2,4,3,5};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);
        assertArrayEquals(new int[]{1,2,3,4,5}, arr);
    }
}





