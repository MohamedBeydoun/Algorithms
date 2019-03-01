/**
 * InsertionSort
 */
public class InsertionSort {

    public static void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            // save current value
            int current = arr[i];

            // while loop counter
            int j = i - 1;

            // shift all the numbers that are
            // greater than the current number by one
            // This makes it so that j will index the
            // location of the current number
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            // j+1 since we decrement an extra time at the end of the loop
            arr[j + 1] = current;
        }
    }
}