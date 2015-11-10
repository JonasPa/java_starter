package lt.starter.morse;

/**
 * Created by Andrius on 2015-11-06.
 */
public class MorseUtils {
    public static String morseNumber(int index) {
        char point = '.';
        if (index < 6) {
            char[] toFive = "-----".toCharArray();
            for (int i = 0; i < index; i++) {
                toFive[i] = point;
            }
            return String.valueOf(toFive);
        } else {

            char[] toFive = ".....".toCharArray();
            char dash = '-';
            for (int i = 0; i < index-5; i++) {
                toFive[i] = dash;

            }
            return String.valueOf(toFive);
        }
    }
}
