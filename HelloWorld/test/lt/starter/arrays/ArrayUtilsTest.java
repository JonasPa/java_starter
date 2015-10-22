package lt.starter.arrays;

import org.junit.Test;

import static lt.starter.SequenceTasksTest.array;
import static org.junit.Assert.*;

/**
 * Created by Andrius-PC on 2015-10-06.
 */
public class ArrayUtilsTest {

    @Test
    public void testCollectGreaterThan() throws Exception {
        assertArrayEquals(array(8, 9, 6), ArrayUtils.collectGreaterThan(5, array(5, 4, 8, 9, 6)));
    }

    @Test
    public void testReverseArray() throws Exception {
        assertArrayEquals(array(6, 9, 8, 4, 5), ArrayUtils.reverseArray(array(5, 4, 8, 9, 6)));
    }

    @Test
    public void testContains() throws Exception {
        assertTrue(ArrayUtils.contains(8, array(5, 4, 8, 7, 10)));
    }

    @Test
    public void testRemoveFromArray() throws Exception {
        assertArrayEquals(array(5, 4, 9, 6, 0), ArrayUtils.removeFromArray(8, array(5, 4, 8, 9, 6)));
    }

    @Test
    public void testInsert() throws Exception {
        assertArrayEquals(array(5, 10, 4, 9), ArrayUtils.insert(10, 1, array(5, 4, 9, 6)));
    }

    @Test
    public void testIndexOf() throws Exception {
        assertEquals(1, ArrayUtils.indexOf(5, array(10, 5, 7, 4)));

    }

    @Test
    public void testRemoveByIndex() throws Exception {
        assertArrayEquals(array(5, 4, 9, 6, 0), ArrayUtils.removeByIndex(2, array(5, 4, 8, 9, 6)));
    }

    @Test
    public void testArraySum() throws Exception {

    }
}