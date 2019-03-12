import java.util.HashMap;

/**
 * PairSum: find int pairs that sum up to a given k in O(n) time (naive being
 * O(n^2))
 */
public class PairSum {

    // we go through the array once while storing the complement
    // of the current array value in a hashmap (constant time access for
    // comparisons)
    public static void checkPairs(int[] arr, int k) {
        // hashmap that stores <complement, index>
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) != null) {
                System.out.println(arr[map.get(arr[i])] + " " + arr[i]);
            }
            map.put(k - arr[i], i);
        }
    }
}