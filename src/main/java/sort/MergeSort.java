package sort;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left >= right)
            return;

        int mid = left + (right - left) / 2;
        mergeSort(arr, temp, left, mid);
        mergeSort(arr, temp, mid + 1, right);
        merge(arr, temp, left, mid, right);
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left; // pointer for left half
        int j = mid + 1; // pointer for right half
        int k = left; // pointer for temp

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++]; // <= keeps it stable
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];
        while (j <= right)
            temp[k++] = arr[j++];

        for (int p = left; p <= right; p++)
            arr[p] = temp[p];
    }

    public static void main(String[] args) {
        int[] a = { 8, 3, 5, 4, 7, 6, 1, 2 };
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }
}