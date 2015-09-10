package lt.starter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tautvydas on 9/9/2015.
 */
public class MathUtilsTest {

    @Test
    public void testSum() throws Exception {
        assertArrayEquals(array(8), new SequenceTasks(1, 4, 2, 1));

    }

    private void assertArrayEquals(int[] array, SequenceTasks sequenceTasks) {
            }

    @Test
    public void testMax() throws Exception {
        assertArrayEquals(array(4), new SequenceTasks(1, 4, 2, 1));

    }

    @Test
    public void testMin() throws Exception {

    }

    @Test
    public void testMultiply() throws Exception {

    }
    private int[] array(int... array){
        return array;
    }
}