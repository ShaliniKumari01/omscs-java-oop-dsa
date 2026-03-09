package sort;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int p = partition(arr, low, high); // pivot index in final position
        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);
    }

    // Lomuto partition
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low; // place for next smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, high); // put pivot in correct spot
        return i;
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) {
        int[] a = { 8, 3, 5, 4, 7, 6, 1, 2 };
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }

}
