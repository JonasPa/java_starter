package lt.starter;

/**
 * Created by Jonas Pakalnis
 */
public class MathUtils {
    public static long sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int max(int... numbers) {
        int max = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int min(int... numbers) {
        int min = 0;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static long multiply(int... numbers) {
        int multiply = 0;
        for (int number : numbers) {
            if (number > multiply) {
                multiply = multiply * number;
            }
        }
        return multiply;
    }
}