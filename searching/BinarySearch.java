/**
 * BinarySearch (This is an integer binary search but will be made into a
 * generic binary search soon)
 */
public class BinarySearch {

    public static int hasElement(int[] arr, int x, int lIndex, int rIndex) {

        if (rIndex >= lIndex) {
            int mid = (lIndex + rIndex) >>> 1;
            // base condition
            if (arr[mid] == x) {
                return mid;
                // mid value is smaller
            } else if (arr[mid] < x) {
                return hasElement(arr, x, mid + 1, rIndex);
                // mid value is larger
            } else {
                return hasElement(arr, x, lIndex, mid - 1);
            }
        }
        return -1;

    }
}
