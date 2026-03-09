package sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class QuickSortTest {

    @Test
    void sortsEmptyArray() {
        int[] arr = {};
        QuickSort.quickSort(arr);
        assertArrayEquals(new int[] {}, arr);
    }

    @Test
    void sortsSingleElementArray() {
        int[] arr = { 42 };
        QuickSort.quickSort(arr);
        assertArrayEquals(new int[] { 42 }, arr);
    }

    @Test
    void sortsAlreadySortedArray() {
        int[] arr = { 1, 2, 3, 4, 5 };
        QuickSort.quickSort(arr);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, arr);
    }

    @Test
    void sortsReverseSortedArray() {
        int[] arr = { 5, 4, 3, 2, 1 };
        QuickSort.quickSort(arr);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, arr);
    }

    @Test
    void sortsWithDuplicates() {
        int[] arr = { 3, 1, 2, 3, 2, 1, 3 };
        QuickSort.quickSort(arr);
        assertArrayEquals(new int[] { 1, 1, 2, 2, 3, 3, 3 }, arr);
    }

    @Test
    void sortsWithNegativesAndZeros() {
        int[] arr = { 0, -10, 5, -3, 2, 0, -1 };
        QuickSort.quickSort(arr);
        assertArrayEquals(new int[] { -10, -3, -1, 0, 0, 2, 5 }, arr);
    }

    @Test
    void sortsRandomArrayMatchesArraysSort() {
        Random rnd = new Random(123);
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(2001) - 1000;
        }

        int[] expected = Arrays.copyOf(arr, arr.length);
        Arrays.sort(expected);

        QuickSort.quickSort(arr);

        assertArrayEquals(expected, arr);
    }
}