package lt.starter;

import java.util.ArrayList;
import java.util.List;

import static lt.starter.SequenceTasks.toIntArray;

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

    public static int[] divisible(int from, int to) {
        List<Integer> divisible = new ArrayList<>();
        for (int i = from; i < to; i++) {
            if (i % 3 == 0)
                divisible.add(i);
        }

        int[] array = toIntArray(divisible);
        return array;
    }
}