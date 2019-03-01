/**
 * MergeSort
 */
public class MergeSort {

    public static int[] merge(int[] arr1, int[] arr2) {

        int i = 0, j = 0, r = 0;
        int[] result = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[r] = arr1[i];
                i++;
            } else if (arr1[i] >= arr2[j]) {
                result[r] = arr2[j];
                j++;
            }
            r++;
        }

        while (i < arr1.length) {
            result[r] = arr1[i];
            i++;
            r++;
        }

        while (j < arr2.length) {
            result[r] = arr2[j];
            j++;
            r++;
        }

        return result;
    }

    public static int[] sort(int[] arr) {

        if (arr.length <= 1) {
            return arr;
        } else {
            int mid = arr.length / 2;
            int[] arr1 = new int[mid];
            int[] arr2 = new int[arr.length - mid];

            for (int i = 0; i < mid; i++) {
                arr1[i] = arr[i];
            }

            for (int i = 0; i < arr.length - mid; i++) {
                arr2[i] = arr[i + mid];
            }
            return merge(sort(arr1), sort(arr2));
        }
    }
}