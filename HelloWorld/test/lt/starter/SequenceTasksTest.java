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
        assertEquals(true, SequenceTasks.isEvenNumber(8));
        assertEquals(false, SequenceTasks.isEvenNumber(7));
        assertEquals(true, SequenceTasks.isEvenNumber(0));
        assertEquals(true, SequenceTasks.isEvenNumber(-14));
    }

    @Test
    public void testIsPositiveNumber() throws Exception {
        assertEquals(true, SequenceTasks.isPositiveNumber(5));
        assertEquals(false, SequenceTasks.isPositiveNumber(-14));
        assertEquals(true, SequenceTasks.isPositiveNumber(0));
    }

    @Test
    public void testCollectEvenNumbers() throws Exception {
        assertArrayEquals(array(-58, 12, 86, 52), new SequenceTasks(-58, 12, 86, -85, 52).collectEvenNumbers());
        assertArrayEquals(array(-58), new SequenceTasks(-58, 321, 251, 531).collectEvenNumbers());
        assertArrayEquals(array(8, 10), new SequenceTasks(-25, 8, 10, 23).collectEvenNumbers());
        assertArrayEquals(array(0, -26, 8), new SequenceTasks(-43, 1, 0, -26, 8).collectEvenNumbers());
    }

    @Test
    public void testCollectNegativeNumbers() throws Exception {
        assertArrayEquals(array(-58, -85), new SequenceTasks(-58, 12, 86, -85, 52).collectNegativeNumbers());
        assertArrayEquals(array(-58), new SequenceTasks(-58, 321, 251, 531).collectNegativeNumbers());
        assertArrayEquals(array(-25), new SequenceTasks(-25, 8, 10, 23).collectNegativeNumbers());
        assertArrayEquals(array(-43, -26), new SequenceTasks(-43, 1, 0, -26, 8).collectNegativeNumbers());
    }

    @Test
    public void testCollectNegativeOrEvenNumbers() throws Exception {
        assertArrayEquals(array(-58, 12, 86, 52), new SequenceTasks(-58, 12, 86, -85, 52).collectNegativeOrEvenNumbers());
        assertArrayEquals(array(-58), new SequenceTasks(-58, 321, 251, 531).collectNegativeOrEvenNumbers());
        assertArrayEquals(array(), new SequenceTasks(-25, 8, 10, 23).collectNegativeOrEvenNumbers());
        assertArrayEquals(array(-26), new SequenceTasks(-43, 1, 0, -26, 8).collectNegativeOrEvenNumbers());
    }

    @Test
    public void testRemoveDuplicates(){
        assertArrayEquals(array(1, 2, 3), SequenceTasks.removeDuplicates(1, 2, 2, 3));
    }

    private int[] array(int... array){
        return array;
    }
}