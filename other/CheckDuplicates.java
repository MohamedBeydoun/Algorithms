/**
 * CheckDuplicates
 */
public class CheckDuplicates {

    public static void checkDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // if the value isn't seen before, the arr[i]'th position is marked with a -
            if (arr[Math.abs(arr[i])] >= 0) {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
                // if the position is marked, print duplicate
            } else {
                System.out.print(Math.abs(arr[i]));
            }
        }
    }
}