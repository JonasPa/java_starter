package lt.starter.utils;

import lt.starter.utils.ReplaceText;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrius-PC on 2015-09-28.
 */
public class ReplaceTextTest {

    @Test
    public void testReplace() throws Exception {
        assertEquals("ACCA", ReplaceText.replaceChar("ABBA", 'B', 'C'));
    }
}