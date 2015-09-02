package lt.starter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jonas on 2015-09-02.
 */
public class SequenceTasksTest {

    @Test
    public void testCountEvenAndPositiveNumbers() throws Exception {

        assertEquals(6, new SequenceTasks(-58, 12, 86, -85, 52).countEvenAndPositiveNumbers());
        assertEquals(5, new SequenceTasks(-58, 321, 251, 531).countEvenAndPositiveNumbers());
        assertEquals(6, new SequenceTasks(-25, 8, 7, 23).countEvenAndPositiveNumbers());
        assertEquals(3, new SequenceTasks(-43, 1, 0, -25, 8).countEvenAndPositiveNumbers());

    }


}