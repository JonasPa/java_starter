package lt.starter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jonas on 2015-09-02.
 */
public class SequenceTasksTest {

    @Test
    public void testCountEvenAndPositiveNumbers() throws Exception {

        assertEquals(3, new SequenceTasks(-58, 12, 86, -85, 52).countEvenAndPositiveNumbers());
        assertEquals(0, new SequenceTasks(-58, 321, 251, 531).countEvenAndPositiveNumbers());
        assertEquals(1, new SequenceTasks(-25, 8, 7, 23).countEvenAndPositiveNumbers());
        assertEquals(2, new SequenceTasks(-43, 1, 0, -25, 8).countEvenAndPositiveNumbers());



    }
    @Test
    public void testIsEvenNumber() throws Exception {
        assertEquals(true, new SequenceTasks().isEvenNumber(8));
        assertEquals(false, new SequenceTasks().isEvenNumber(7));
        assertEquals(true, new SequenceTasks().isEvenNumber(0));
        assertEquals(true, new SequenceTasks().isEvenNumber(-14));

    }
    @Test
    public void testIsPositiveNumber() throws Exception{
        assertEquals(true, new SequenceTasks().isPositiveNumber(5));
        assertEquals(false, new SequenceTasks().isPositiveNumber(-14));
        assertEquals(true, new SequenceTasks().isPositiveNumber(0));


    }
}