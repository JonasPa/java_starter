package lt.starter.time;

/**
 * Created by Andrius on 2015-11-03.
 */
public class TimeUtils {
    private static int minutesToSeconds(int minutes) {
        return minutes * 60;
    }

    private static int hoursToSecond(int hours) {
        return hours * 3600;
    }

    public static int convertToSeconds(int hours, int minutes, int seconds) {
        seconds = hoursToSecond(hours) + minutesToSeconds(minutes) + seconds;
        return seconds;
    }


    public static boolean countLeapYear(int year) {
        if (year % 4 == 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 != 0) {
            return false;
        } else {
            return false;
        }
    }
}

