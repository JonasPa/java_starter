package lt.starter.math;

import org.junit.Test;

import static lt.starter.utils.SequenceTasksTest.array;
import static org.junit.Assert.*;

/**
 * Created by Tautvydas on 9/9/2015.
 */
public class MathUtilsTest {

    @Test
    public void testSum() throws Exception {
        assertEquals(8, MathUtils.sum(1, 4, 2, 1));
        assertEquals(0, MathUtils.sum(0));
    }

    @Test
    public void testMax() throws Exception {
        assertEquals(4, MathUtils.max(1, 4, 2, 0));
        assertEquals(0, MathUtils.sum(0));
    }

    @Test
    public void testMin() throws Exception {
        assertEquals(0, MathUtils.min(1, 4, 2, 0));
        assertEquals(0, MathUtils.sum(0));
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(8, MathUtils.multiply(1, 4, 2, 0));
        assertEquals(0, MathUtils.sum(0));
    }

    @Test
    public void testDivisible() throws Exception {
        assertArrayEquals(array(3, 6, 9, 12), MathUtils.divisible(1, 13));
        assertArrayEquals(array(-15, -12, -9, -6, -3, 0, 3, 6, 9, 12), MathUtils.divisible(-16, 13));
    }

    @Test
    public void testAverage() throws Exception {
        assertEquals(7, MathUtils.average(1, 4, 5, 8, 10, 18, 7), 2);
        assertEquals(0, MathUtils.average(), 2);
    }

    @Test
    public void testFactorial() throws Exception {
        assertEquals(1, MathUtils.factorial(0));
        assertEquals(1, MathUtils.factorial(1));
        assertEquals(2, MathUtils.factorial(2));
        assertEquals(6, MathUtils.factorial(3));
        assertEquals(24, MathUtils.factorial(4));
        assertEquals(3628800, MathUtils.factorial(10));
        assertEquals(355687428096000l, MathUtils.factorial(17));
    }
    @Test
    public void testIsPrime() throws Exception {
        assertTrue(MathUtils.isPrime(7));
        assertTrue(MathUtils.isPrime(5));
        assertTrue(MathUtils.isPrime(11));
        assertTrue(MathUtils.isPrime(19));
        assertFalse(MathUtils.isPrime(12));
        assertFalse(MathUtils.isPrime(14));
        assertFalse(MathUtils.isPrime(16));
        assertFalse(MathUtils.isPrime(256448599));
    }


    /**
     * Created by Jonas Pakalnis
     */
}