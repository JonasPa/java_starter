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
    public void testIsPositiveNumber() throws Exception {
        assertEquals(true, new SequenceTasks().isPositiveNumber(5));
        assertEquals(false, new SequenceTasks().isPositiveNumber(-14));
        assertEquals(true, new SequenceTasks().isPositiveNumber(0));
    }

    @Test
    public void testCollectEvenNumbers() throws Exception {
        assertArrayEquals(new int[]{-58, 12, 86, 52}, new SequenceTasks(-58, 12, 86, -85, 52).collectEvenNumbers());
        assertArrayEquals(new int[]{-58}, new SequenceTasks(-58, 321, 251, 531).collectEvenNumbers());
        assertArrayEquals(new int[]{8, 10}, new SequenceTasks(-25, 8, 10, 23).collectEvenNumbers());
        assertArrayEquals(new int[]{0, -26, 8}, new SequenceTasks(-43, 1, 0, -26, 8).collectEvenNumbers());

    }

    @Test
    public void testCollectNegativeNumbers() throws Exception {
        assertArrayEquals(new int[]{-58, -85}, new SequenceTasks(-58, 12, 86, -85, 52).collectNegativeNumbers());
        assertArrayEquals(new int[]{-58}, new SequenceTasks(-58, 321, 251, 531).collectNegativeNumbers());
        assertArrayEquals(new int[]{-25}, new SequenceTasks(-25, 8, 10, 23).collectNegativeNumbers());
        assertArrayEquals(new int[]{-43, -26}, new SequenceTasks(-43, 1, 0, -26, 8).collectNegativeNumbers());
    }

    @Test
    public void testCollectNegativeOrEvenNumbers() throws Exception {
        assertArrayEquals(new int[]{-58, 12, 86, 52}, new SequenceTasks(-58, 12, 86, -85, 52).collectNegativeOrEvenNumbers());
        assertArrayEquals(new int[]{-58}, new SequenceTasks(-58, 321, 251, 531).collectNegativeOrEvenNumbers());
        assertArrayEquals(new int[]{}, new SequenceTasks(-25, 8, 10, 23).collectNegativeOrEvenNumbers());
        assertArrayEquals(new int[]{-26}, new SequenceTasks(-43, 1, 0, -26, 8).collectNegativeOrEvenNumbers());
    }
}