/**
 * FastExponentiation
 */
public class FastExponentiation {

    public static int betterPower(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            int factor = betterPower(base, exp / 2);
            if (exp % 2 == 0)
                return factor * factor;
            else
                return factor * factor * base;
        }
    }
}