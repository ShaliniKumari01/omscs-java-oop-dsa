package sort;

public class BubbleSort {

    public static void sort(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("arr cannot be null");
        }
        boolean swapped;
        for (int j = 0; j < arr.length - 1; j++) {
            swapped = false;
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped)
                return; // already sorted
        }
    }
}
