package recursion;

public class PowerFast {
    // Computes base^exp for exp >= 0
    public static long pow(long base, int exp) {
        if (exp < 0)
            throw new IllegalArgumentException("exp must be >= 0");
        if (exp == 0)
            return 1L;
        if (exp == 1)
            return base;

        long half = pow(base, exp / 2);
        long result = half * half;

        if (exp % 2 == 1)
            result *= base;
        return result;
    }
}