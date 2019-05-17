/**
 * Anagrams
 */
public class Anagrams {

    public static void helper(String s, int[] chars) {

        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)] += 1;
        }

    }

    public static boolean isAnagram(String s1, String s2) {

        int[] s1Chars = new int[256];
        int[] s2Chars = new int[256];

        helper(s1, s1Chars);
        helper(s2, s2Chars);

        for (int i = 0; i < 256; i++) {
            if (s1Chars[i] != s2Chars[i]) {
                return false;
            }
        }

        return true;
    }
}