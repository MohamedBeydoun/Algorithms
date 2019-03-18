
/**
 * Sort012: sort an array of 0s, 1s, and 2s in O(n)
 */
public class Sort012 {

    public static void sort(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        int index = 0; // start the index at lo
        while (index <= hi) {
            if (arr[index] == 0) {
                int temp = arr[index];
                arr[index] = arr[lo];
                arr[lo] = temp;
                lo++;
                index++;
            } else if (arr[index] == 1) {
                index++;
            } else {
                int temp = arr[index];
                arr[index] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
    }
}