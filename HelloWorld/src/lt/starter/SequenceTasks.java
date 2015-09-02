package lt.starter;

/**
 * Created by Jonas on 2015-09-02.
 */
public class SequenceTasks {

    private final String sequence;

    public SequenceTasks(String sequence) {
        this.sequence = sequence.replaceAll("\\D","");
    }

    //98648548
    public int countEvenAndPositiveNumbers() {
        int count=0;
        for (char c : sequence.toCharArray()) {
            int x = c-48;
            if (x%2==0){
                count++;
            }

        }

        return count;
    }
}
