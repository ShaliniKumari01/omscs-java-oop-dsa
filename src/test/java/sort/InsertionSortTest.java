package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTest {

    @Test
    void sortsRandomArray() {
        int[] arr = { 3, 2, 7, 4, 1 };

        InsertionSort.sort(arr);

        assertArrayEquals(new int[] { 1, 2, 3, 4, 7 }, arr);
    }

    @Test
    void sortsAlreadySortedArray() {
        int[] arr = { 1, 2, 3, 4, 5 };

        InsertionSort.sort(arr);

        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, arr);
    }

    @Test
    void sortsReverseSortedArray() {
        int[] arr = { 5, 4, 3, 2, 1 };

        InsertionSort.sort(arr);

        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, arr);
    }

    @Test
    void sortsArrayWithDuplicates() {
        int[] arr = { 4, 2, 4, 1, 2 };

        InsertionSort.sort(arr);

        assertArrayEquals(new int[] { 1, 2, 2, 4, 4 }, arr);
    }

    @Test
    void sortsArrayWithNegativeNumbers() {
        int[] arr = { 3, -1, 0, -5, 2 };

        InsertionSort.sort(arr);

        assertArrayEquals(new int[] { -5, -1, 0, 2, 3 }, arr);
    }

    @Test
    void handlesSingleElementArray() {
        int[] arr = { 42 };

        InsertionSort.sort(arr);

        assertArrayEquals(new int[] { 42 }, arr);
    }

    @Test
    void handlesEmptyArray() {
        int[] arr = {};

        InsertionSort.sort(arr);

        assertArrayEquals(new int[] {}, arr);
    }

    @Test
    void nullArrayThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> InsertionSort.sort(null));
    }
}