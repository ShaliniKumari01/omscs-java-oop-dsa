package sort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // find index of minimum element in remaining unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap into position i
            if (minIndex != i) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 64, 25, 12, 22, 11 };
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
