package lt.starter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


/**
 * Created by Jonas on 2015-09-02.
 */
public class SequenceTasks {

    private final int[] sequence;

    public SequenceTasks(int... sequence) {
        this.sequence = sequence;

    }

    public int countEvenAndPositiveNumbers() {
        int count = 0;
        for (int number : sequence) {
            if (isEvenNumber(number) && isPositiveNumber(number)) {
                count++;
            }

        }
        return count;

    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositiveNumber(int number) {
        return number >= 0;
    }

    public static int[] toIntArray(List<Integer> list) {
        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++)
            ret[i] = list.get(i);
        return ret;
    }

    public int[] collectEvenNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int number : sequence) {
            if (isEvenNumber(number)) {
                numbers.add(number);
            }
        }
        int[] array = toIntArray(numbers);
        return array;
    }

    public int[] collectNegativeNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int number : sequence) {
            if (!isPositiveNumber(number)) {
                numbers.add(number);
            }
        }
        int[] array = toIntArray(numbers);
        return array;

    }
    public int[] collectNegativeOrEvenNumbers() {
        int[] negativeNumbers = collectNegativeNumbers();
        int[] evenNumbers = collectEvenNumbers();

        int[] array = new int[negativeNumbers.length+evenNumbers.length];
        System.arraycopy(negativeNumbers, 0, array, 0, negativeNumbers.length);

        System.arraycopy(evenNumbers, 0, array, 0 + negativeNumbers.length, evenNumbers.length);

        Arrays.sort(array);
        return removeDuplicates(array);
    }

    public static int[] removeDuplicates(int... numbers) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (!result.contains(number))
            result.add(number);


        }

        int[]  array = toIntArray(result);
        return array;
    }

    public int[] collectMaxNumbers() {
        return new int[0];
    }
}




