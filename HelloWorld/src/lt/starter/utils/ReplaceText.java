package lt.starter.utils;

/**
 * Created by Andrius-PC on 2015-09-28.
 */
public class ReplaceText {
    public static String replaceChar(String text, char from, char to) {
        char[] words = text.toCharArray();
        // String letter = String.valueOf(words);
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == from) {
                words[i] = to;
            }
        }
        return String.valueOf(words);
    }
}
