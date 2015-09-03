package lt.starter;

import java.util.ArrayList;
import java.util.List;


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
            for(int number: sequence){
                if (isEvenNumber(number)&& isPositiveNumber(number)){
                count++;


            }

        }
        return count;

    }

    public boolean isEvenNumber(int number) {
        return number%2==0;
    }

    public boolean isPositiveNumber(int number) {
        return number>=0;
    }
    int[] toIntArray(List<Integer> list){
        int[] ret = new int[list.size()];
        for(int i = 0;i < ret.length;i++)
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
}
