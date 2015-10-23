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
    public void testSubArrays() throws Exception {
        assertArrayEquals(array(8, 9, 6), ArrayUtils.subArrays(array(5, 4, 8, 9, 6, 10, 18, 21), 2, 5));
    }

    @Test
    public void testRevertArray() throws Exception {
        assertArrayEquals(array(10, 8, 6, 5), ArrayUtils.revertArray(array(5, 6, 8, 10)));
    }

    @Test
    public void testLastIndexOf() throws Exception {
        assertEquals(5, ArrayUtils.lastIndexOf(8, array(4, 6, 8, 7, 5, 8, 10)));
    }

    @Test
    public void testArraySet() throws Exception {
        assertArrayEquals(array(4, 5, 7, 8, 10), ArrayUtils.arraySet(2, 7, array(4, 5, 6, 8, 10)));
    }

    @Test
    public void testSumNumbersInArrays() throws Exception {
        assertEquals(50, ArrayUtils.sumNumbersInArrays(array(5, 6, 8), array(9, 7, 15)));
    }

    @Test
    public void testSumOfArray() throws Exception {
        assertArrayEquals(array(1, 6, 8, 5, 3, 2), ArrayUtils.sumOfArray(array(1, 6, 8), array(5, 3, 2)));

    }

    @Test
    public void testIsEquals() throws Exception {
        assertTrue(ArrayUtils.isEquals(array(1, 2, 3, 4), array(1, 2, 3, 4)));
        assertFalse(ArrayUtils.isEquals(array(1, 2, 3, 4), array(1, 2, 3)));
        assertFalse(ArrayUtils.isEquals(array(1, 2, 3, 4), array(1, 2, 3, 4, 5)));
    }
    @Test
    public void testContainsArray() throws Exception {
        assertTrue(ArrayUtils.containsArray(array(5, 9, 6, 7), array(9, 6)));
        assertTrue(ArrayUtils.containsArray(array(5, 9, 6, 7), array(5, 9, 6, 7)));
        assertFalse(ArrayUtils.containsArray(array(5, 9, 6, 7), array(9, 7)));
    }
}