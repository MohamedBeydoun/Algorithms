/**
 * ArrayManipulation
 */
public class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {

        long[] arr = new long[n];
        // +1 to to avoid edge case
        long[] placeholders = new long[n + 1];

        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0] - 1;
            int b = queries[i][1] - 1;
            int k = queries[i][2];

            placeholders[a] += k;
            placeholders[b + 1] -= k;
        }

        long max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                arr[i] = placeholders[i];
            } else {
                arr[i] = arr[i - 1] + placeholders[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;

    }
}