package lt.starter.time;

import junit.framework.TestCase;

/**
 * Created by Andrius on 2015-11-03.
 */
public class TimeUtilsTest extends TestCase {
    public void testConvertToSeconds() throws Exception {
        assertEquals(39010, TimeUtils.convertToSeconds(10, 50, 10));

    }

    public void testCountLeapYear() throws Exception {
        assertTrue(TimeUtils.countLeapYear(1964));
        assertTrue(TimeUtils.countLeapYear(1968));
        assertFalse(TimeUtils.countLeapYear(1987));
        assertFalse(TimeUtils.countLeapYear(2014));
    }
}
