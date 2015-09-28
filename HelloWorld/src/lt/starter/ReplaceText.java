package lt.starter;
/**
 * Created by Andrius-PC on 2015-09-28.
 */
public class ReplaceText {
    public static String replaceChar(String text, char from, char to) {
        String result = "";
        char[] words = result.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
        if (symbol == from){
           result = result+to;
            } else {
            result = result+symbol;
                }

            }
            return result;
        }
    }