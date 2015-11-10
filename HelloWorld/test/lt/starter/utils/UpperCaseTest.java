package lt.starter.utils;

import lt.starter.utils.UpperCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrius-PC on 2015-09-25.
 */
public class UpperCaseTest {

    @Test
    public void testCapitalize() throws Exception {
        assertEquals("ABCDEFG", UpperCase.capitalize("abcdefg"));
    }
}