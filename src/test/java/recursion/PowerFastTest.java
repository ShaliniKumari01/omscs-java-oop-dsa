package recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowerFastTest {

    @Test
    void pow_baseCases() {
        assertEquals(1L, PowerFast.pow(5, 0));
        assertEquals(5L, PowerFast.pow(5, 1));
        assertEquals(1L, PowerFast.pow(0, 0)); // conventional in many libs
    }

    @Test
    void pow_normalCases() {
        assertEquals(8L, PowerFast.pow(2, 3));
        assertEquals(16L, PowerFast.pow(2, 4));
        assertEquals(81L, PowerFast.pow(3, 4));
    }

    @Test
    void pow_negativeExp_throws() {
        assertThrows(IllegalArgumentException.class, () -> PowerFast.pow(2, -1));
    }
}