package lt.starter;

import org.junit.Test;

import static lt.starter.SequenceTasksTest.array;
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


    
    /**
     * Created by Jonas Pakalnis
     */}