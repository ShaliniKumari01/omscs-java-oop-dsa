package search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchStringTest {

    @Test
    void findsMiddleElement() {
        String[] arr = { "apple", "banana", "cherry", "date", "fig" };
        assertEquals(2, BinarySearchString.indexOf(arr, "cherry"));
    }

    @Test
    void findsFirstElement() {
        String[] arr = { "apple", "banana", "cherry", "date", "fig" };
        assertEquals(0, BinarySearchString.indexOf(arr, "apple"));
    }

    @Test
    void findsLastElement() {
        String[] arr = { "apple", "banana", "cherry", "date", "fig" };
        assertEquals(4, BinarySearchString.indexOf(arr, "fig"));
    }

    @Test
    void returnsMinusOneWhenNotFound() {
        String[] arr = { "apple", "banana", "cherry", "date", "fig" };
        assertEquals(-1, BinarySearchString.indexOf(arr, "grape"));
    }

    @Test
    void emptyArrayReturnsMinusOne() {
        String[] arr = {};
        assertEquals(-1, BinarySearchString.indexOf(arr, "apple"));
    }

    @Test
    void singleElementFound() {
        String[] arr = { "apple" };
        assertEquals(0, BinarySearchString.indexOf(arr, "apple"));
    }

    @Test
    void singleElementNotFound() {
        String[] arr = { "apple" };
        assertEquals(-1, BinarySearchString.indexOf(arr, "banana"));
    }

    @Test
    void duplicatesReturnsAnyMatchingIndex() {
        String[] arr = { "apple", "banana", "banana", "banana", "cherry" };
        int idx = BinarySearchString.indexOf(arr, "banana");
        assertTrue(idx >= 1 && idx <= 3, "Expected any index between 1 and 3");
    }

    @Test
    void caseSensitiveSearch() {
        String[] arr = { "Apple", "Banana", "Cherry" };
        assertEquals(-1, BinarySearchString.indexOf(arr, "banana")); // lowercase not found
        assertEquals(1, BinarySearchString.indexOf(arr, "Banana")); // exact case found
    }

    @Test
    void nullArrayThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> BinarySearchString.indexOf(null, "apple"));
    }

    @Test
    void nullSearchElementThrows() {
        String[] arr = { "apple", "banana", "cherry" };
        assertThrows(IllegalArgumentException.class,
                () -> BinarySearchString.indexOf(arr, null));
    }
}