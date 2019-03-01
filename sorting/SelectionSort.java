/**
 * SelectionSort
 */
public class SelectionSort {

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            // set index to sorted part of the array
            int minIndex = i;
            // loop over unsorted part of array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            // place max in its place
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;

        }
    }
}