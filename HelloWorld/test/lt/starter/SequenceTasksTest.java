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
        assertEquals(true, SequenceTasks.testSum(8));
        assertEquals(false, SequenceTasks.testSum(7));
        assertEquals(true, SequenceTasks.testSum(0));
        assertEquals(true, SequenceTasks.testSum(-14));
    }

    @Test
    public void testIsPositiveNumber() throws Exception {
        assertEquals(true, SequenceTasks.isPositiveNumber(5));
        assertEquals(false, SequenceTasks.isPositiveNumber(-14));
        assertEquals(true, SequenceTasks.isPositiveNumber(0));
    }

    @Test
    public void testCollectEvenNumbers() throws Exception {
        assertArrayEquals(array(-58, 12, 86, 52), new SequenceTasks(-58, 12, 86, -85, 52).testSum());
        assertArrayEquals(array(-58), new SequenceTasks(-58, 321, 251, 531).testSum());
        assertArrayEquals(array(8, 10), new SequenceTasks(-25, 8, 10, 23).testSum());
        assertArrayEquals(array(0, -26, 8), new SequenceTasks(-43, 1, 0, -26, 8).testSum());
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
        assertArrayEquals(array(-85, -58, 12, 52, 86), new SequenceTasks(-58, 12, 86, -85, 52).testSum());
        assertArrayEquals(array(-58), new SequenceTasks(-58, 321, 251, 531).testSum());
        assertArrayEquals(array(-25, 8, 10), new SequenceTasks(-25, 8, 10, 23).testSum());
        assertArrayEquals(array(-43, -26, 0, 8), new SequenceTasks(-43, 1, 0, -26, 8).testSum());
    }

    @Test
    public void testRemoveDuplicates(){
        int[] actuals = SequenceTasks.removeDuplicates(1, 2, 2, 3);
        assertArrayEquals(array(1, 2, 3), actuals);
    }

    public static int[] array(int... array){
        return array;
    }
}