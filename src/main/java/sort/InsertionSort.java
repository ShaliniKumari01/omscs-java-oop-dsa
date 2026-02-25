package sort;

public class InsertionSort {

    public static void sort(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("arr cannot be null");
        }

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift bigger elements one step right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key into correct position
            arr[j + 1] = key;
        }
    }
}