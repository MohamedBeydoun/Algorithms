/**
 * NewYearChaos
 */
public class NewYearChaos {

    static void minimumBribes(int[] q) {
        int bribe = 0;
        boolean isChaotic = false;

        for (int i = 0; i < q.length; i++) {
            if (q[i] - (i + 1) > 2) {
                isChaotic = true;
                break;
            }

            for (int j = Math.max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i]) {
                    bribe++;
                }
        }
        if (isChaotic) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(bribe);
        }
    }
}