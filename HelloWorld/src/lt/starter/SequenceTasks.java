package lt.starter;

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
        for (int i = 0; i < sequence.length; i++){
            int number=sequence[i];
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
}
