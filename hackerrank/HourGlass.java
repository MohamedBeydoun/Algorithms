/**
 * HourGlass
 */
public class HourGlass {

    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < 5; i++) {
            // sum up the hourglass
            for (int j = 1; j < 5; j++) {
                int currSum = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] + arr[i][j] + arr[i + 1][j - 1]
                        + arr[i + 1][j] + arr[i + 1][j + 1];
                if (currSum > max) {
                    max = currSum;
                }
            }
        }

        return max;

    }
}