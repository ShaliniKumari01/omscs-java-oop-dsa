package search;

public class LinearSearch {
    // Returns index of target, or -1 if not found
    public static int indexOf(int[] arr, int target) {
        if (arr == null)
            throw new IllegalArgumentException("arr is null");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}