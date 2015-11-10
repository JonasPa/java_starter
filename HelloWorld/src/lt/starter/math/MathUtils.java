package lt.starter.math;

import java.util.ArrayList;
import java.util.List;

import static lt.starter.utils.SequenceTasks.toIntArray;

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

    public static double average(int... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum / numbers.length;
    }

    public static long factorial(long number) {
        long fact = 1;
        for (long i = 1; i <= number; i++) {
            fact = fact * i;

        }
        return fact;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}