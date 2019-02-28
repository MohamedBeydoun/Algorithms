/**
 * ReverseString
 */
public class ReverseString {

    public static String reverseString(String word) {
        if (word.length() == 0) {
            return word;
        } else {
            return reverseString(word.substring(1)) + word.charAt(0);
        }
    }
}