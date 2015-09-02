package lt.starter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jonas on 2015-09-02.
 */
public class SequenceTasksTest {

    @Test
    public void testCountEvenAndPositiveNumbers() throws Exception {

        assertEquals(6,new SequenceTasks("98648a548").countEvenAndPositiveNumbers());
        assertEquals(5, new SequenceTasks("86452a4").countEvenAndPositiveNumbers());
        assertEquals(6, new SequenceTasks("645214a562").countEvenAndPositiveNumbers());
        assertEquals(3, new SequenceTasks("225aasfdfsd43").countEvenAndPositiveNumbers());

    }


}