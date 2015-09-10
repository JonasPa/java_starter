package lt.starter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tautvydas on 9/9/2015.
 */
public class MathUtils {
    public static long sum(int... numbers) {
        int sum = 0;
        for (int counter = 0; counter < numbers.length; counter++) {
            sum += numbers[counter];
        }
        return sum;
    }

    public static int max(int... numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            return max;
        }

        public static int min(int... numbers) {
        return -1;
        }

        public static long multiply(int... numbers) {
        return -1;
         }
    }
}