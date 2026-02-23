package search;

public class BinarySearchString {

    // Array must be sorted ascending. Returns index or -1.

    public static int indexOf(String[] arr, String searchElement) {

        if (arr == null) {
            throw new IllegalArgumentException("array cannot be  null");
        }

        if (searchElement == null) {
            throw new IllegalArgumentException("searchElement cannot be null");
        }
        int left = 0;
        int right = arr.length - 1; // inclusive

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = arr[mid].compareTo(searchElement);

            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
