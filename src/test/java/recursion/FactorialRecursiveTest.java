package recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialRecursiveTest {

    @Test
    void factorial_baseCases() {
        assertEquals(1L, FactorialRecursive.factorial(0));
        assertEquals(1L, FactorialRecursive.factorial(1));
    }

    @Test
    void factorial_normalCases() {
        assertEquals(2L, FactorialRecursive.factorial(2));
        assertEquals(6L, FactorialRecursive.factorial(3));
        assertEquals(24L, FactorialRecursive.factorial(4));
        assertEquals(120L, FactorialRecursive.factorial(5));
    }

    @Test
    void factorial_negative_throws() {
        assertThrows(IllegalArgumentException.class, () -> FactorialRecursive.factorial(-1));
    }
}