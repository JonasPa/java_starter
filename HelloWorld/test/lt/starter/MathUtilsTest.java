package lt.starter;

import org.junit.Test;

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
    /**
     * Created by Jonas Pakalnis
     */}