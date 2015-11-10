package lt.starter.morse;

import junit.framework.TestCase;

/**
 * Created by Andrius on 2015-11-06.
 */
public class MorseUtilsTest extends TestCase {

    public void testMorseNumber() throws Exception {
        assertEquals("-----", MorseUtils.morseNumber(0));
        assertEquals(".----", MorseUtils.morseNumber(1));
        assertEquals("..---", MorseUtils.morseNumber(2));
        assertEquals("...--", MorseUtils.morseNumber(3));
        assertEquals("....-", MorseUtils.morseNumber(4));
        assertEquals(".....", MorseUtils.morseNumber(5));
        assertEquals("-....", MorseUtils.morseNumber(6));
        assertEquals("--...", MorseUtils.morseNumber(7));
        assertEquals("---..", MorseUtils.morseNumber(8));
        assertEquals("----.", MorseUtils.morseNumber(9));
    }
}