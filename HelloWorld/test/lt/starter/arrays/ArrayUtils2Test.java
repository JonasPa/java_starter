package lt.starter.arrays;

import org.junit.Test;

import static lt.starter.SequenceTasksTest.array;
import static org.junit.Assert.*;

/**
 * Created by Jonas Pakalnis
 */
public class ArrayUtils2Test {

    @Test
    public void testContains() throws Exception {

        assertTrue(ArrayUtils2.contains(array(1, 2, 3), 2));
        assertFalse(ArrayUtils2.contains(array(1, 2, 3), 10));
    }

    @Test
    public void testRevert() throws Exception {
        assertArrayEquals(array(3, 2, 1), ArrayUtils2.revert(array(1, 2, 3)));
    }

    @Test
    public void testSubArray() throws Exception {
        assertArrayEquals(array(4, 8, 9), ArrayUtils2.subArray(array(5, 4, 8, 9, 6), 1, 4));
        assertArrayEquals(array(8,9,6), ArrayUtils2.subArray(array(5,4,8,9,6),2,5));
    }

    @Test
    public void testLastIndexOf() throws Exception {
        assertEquals(6, ArrayUtils2.lastIndexOf(8,array(4,6,8,7,5,4,8,9)));
    }

    @Test
    public void testArraySum() throws Exception {
        assertEquals(27, ArrayUtils2.arraySum(array(4, 5, 9, 8, 1)));
    }

    @Test
    public void testRemoveArray() throws Exception {
        assertArrayEquals(
                array(4,5,0,8,10),
                ArrayUtils2.removeArray(
                        2,
                        array(4,5,6,8,10)
                )
        );
    }
}

