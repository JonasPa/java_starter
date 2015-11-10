package lt.starter.text;

/**
 * Created by Andrius on 2015-11-04.
 */
public class TextUtils {
    public static boolean isPalindrome(String text) {
        String isStringPalindrome = TextUtils.removeTrashFromString(text).toLowerCase();
        for (int forw = 0; forw < text.length(); forw++) {
            if (text.charAt(forw) == text.charAt(text.length() - forw - 1)) {
                return true;
            }
        }
        return false;
    }


    static String removeTrashFromString(String text) {
        char letter;
        String normalString = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                normalString += text.charAt(i);
            }
        }
        return normalString;
    }

    public static String pigLatin(String sentence) {
        String[] words = sentence.split(" ");
        String pigLatined = "";
        for (int i = 0; i < words.length; i++) {
            pigLatined += TextUtils.encryption(words[i]) + " ";
        }
        return pigLatined.substring(0, pigLatined.length() - 1);
    }


    static String encryption(String text) {
        String encrypted = "";
        encrypted = text.substring(1, text.length()) + text.charAt(0) + "ay";
        return encrypted.toLowerCase();
    }
}
