package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    @Test
    void sortsRandomArray() {
        int[] arr = { 3, 2, 7, 4, 1 };

        BubbleSort.sort(arr);

        assertArrayEquals(new int[] { 1, 2, 3, 4, 7 }, arr);
    }

    @Test
    void sortsAlreadySortedArray() {
        int[] arr = { 1, 2, 3, 4, 5 };

        BubbleSort.sort(arr);

        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, arr);
    }

    @Test
    void sortsReverseSortedArray() {
        int[] arr = { 5, 4, 3, 2, 1 };

        BubbleSort.sort(arr);

        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, arr);
    }

    @Test
    void sortsArrayWithDuplicates() {
        int[] arr = { 4, 2, 4, 1, 2 };

        BubbleSort.sort(arr);

        assertArrayEquals(new int[] { 1, 2, 2, 4, 4 }, arr);
    }

    @Test
    void sortsArrayWithNegativeNumbers() {
        int[] arr = { 3, -1, 0, -5, 2 };

        BubbleSort.sort(arr);

        assertArrayEquals(new int[] { -5, -1, 0, 2, 3 }, arr);
    }

    @Test
    void handlesSingleElementArray() {
        int[] arr = { 42 };

        BubbleSort.sort(arr);

        assertArrayEquals(new int[] { 42 }, arr);
    }

    @Test
    void handlesEmptyArray() {
        int[] arr = {};

        BubbleSort.sort(arr);

        assertArrayEquals(new int[] {}, arr);
    }

    @Test
    void nullArrayThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> BubbleSort.sort(null));
    }

    // Optional learning/debug style test with print output
    @Test
    void printsBeforeAndAfterForLearning() {
        int[] arr = { 3, 2, 7, 4, 1 };
        System.out.println("Before BubbleSort: " + Arrays.toString(arr));

        BubbleSort.sort(arr);

        System.out.println("After  BubbleSort: " + Arrays.toString(arr));
        assertArrayEquals(new int[] { 1, 2, 3, 4, 7 }, arr);
    }
}