package lt.starter.arrays;

import lt.starter.SequenceTasks;
import org.junit.Test;

import static lt.starter.SequenceTasksTest.array;
import static org.junit.Assert.*;

/**
 * Created by Andrius-PC on 2015-10-06.
 */
public class ArrayUtilsTest {

    @Test
    public void testCollectGreaterThan() throws Exception {
        assertArrayEquals(array(-85, -58, 12, 52, 86), new ArrayUtils(5, 4, 8, 9, 6).testSum());

    }


}