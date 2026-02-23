package search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinearSearchTest {

    @Test
    void findsElement() {
        int[] arr = { 4, 7, 1, 9 };
        assertEquals(1, LinearSearch.indexOf(arr, 7));
    }

    @Test
    void notFound() {
        int[] arr = { 4, 7, 1, 9 };
        assertEquals(-1, LinearSearch.indexOf(arr, 5));
    }

    @Test
    void emptyArray() {
        assertEquals(-1, LinearSearch.indexOf(new int[] {}, 10));
    }
}