/**
 * Palindrome
 */
public class Palindrome {

    public static boolean isPalindrome(String word) {
        int n = word.length();
        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - i - 1))
                return false;
        }
        return true;
    }

    public static boolean isPalindromeRec(String s) {

        // Base case 1
        if (s.length() == 0) {
            return true;
        }
        // Base case 2
        else if (s.length() == 1) {
            return true;
        }
        else {
            if (s.charAt(0) == s.charAt(s.length() - 1)){
                return isPalindromeRec(s.substring(1, s.length() - 1));
            }

            return false;
        }
    }
}