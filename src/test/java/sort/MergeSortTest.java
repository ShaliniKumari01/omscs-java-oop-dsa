package sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MergeSortTest {

    @Test
    void testAlreadySortedArray() {
        int[] arr = { 1, 2, 3, 4, 5 };
        MergeSort.mergeSort(arr);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, arr);
    }

    @Test
    void testReverseSortedArray() {
        int[] arr = { 5, 4, 3, 2, 1 };
        MergeSort.mergeSort(arr);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, arr);
    }

    @Test
    void testRandomArray() {
        int[] arr = { 8, 3, 5, 4, 7, 6, 1, 2 };
        MergeSort.mergeSort(arr);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, arr);
    }

    @Test
    void testArrayWithDuplicates() {
        int[] arr = { 4, 2, 5, 2, 3, 4, 1 };
        MergeSort.mergeSort(arr);
        assertArrayEquals(new int[] { 1, 2, 2, 3, 4, 4, 5 }, arr);
    }

    @Test
    void testArrayWithNegativeNumbers() {
        int[] arr = { 3, -1, 0, -7, 8, 2 };
        MergeSort.mergeSort(arr);
        assertArrayEquals(new int[] { -7, -1, 0, 2, 3, 8 }, arr);
    }

    @Test
    void testSingleElementArray() {
        int[] arr = { 10 };
        MergeSort.mergeSort(arr);
        assertArrayEquals(new int[] { 10 }, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        MergeSort.mergeSort(arr);
        assertArrayEquals(new int[] {}, arr);
    }

    @Test
    void testArrayWithAllSameElements() {
        int[] arr = { 7, 7, 7, 7, 7 };
        MergeSort.mergeSort(arr);
        assertArrayEquals(new int[] { 7, 7, 7, 7, 7 }, arr);
    }
}