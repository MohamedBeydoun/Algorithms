/**
 * LeftRotation
 */
public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {
        int[] newA = new int[a.length];
        int i = 0;
        for (int j = 0; j < a.length; j++) {
            if (j >= a.length - d) {
                newA[j] = a[i];
                i++;
            } else {
                newA[j] = a[j + d];
            }
        }

        return newA;

    }
}