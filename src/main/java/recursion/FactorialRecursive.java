package recursion;

public class FactorialRecursive {
    // n! for n >= 0
    public static long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("n must be >= 0");
        if (n == 0 || n == 1)
            return 1L;
        return n * factorial(n - 1);
    }
}
