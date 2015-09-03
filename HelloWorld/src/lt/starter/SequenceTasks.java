package lt.starter;

import java.util.ArrayList;
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

    public boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public boolean isPositiveNumber(int number) {
        return number >= 0;
    }

    int[] toIntArray(List<Integer> list) {
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
        List<Integer> numbers = new ArrayList<>();
        int[] negativeNumbers = collectNegativeNumbers();
        int[] evenNumbers = collectEvenNumbers();

//        Integer[] both = Stream.of(negativeNumbers, evenNumbers).flatMap(Stream::of).toArray(Integer[]::new);


        int[] array = new int[negativeNumbers.length+evenNumbers.length];
        for (int i=0; i<negativeNumbers.length; i++)
            array[i]=negativeNumbers[i];

        for (int i=0; i<evenNumbers.length; i++)
            array[i+negativeNumbers.length]=evenNumbers[i];

        return array;
    }
}
