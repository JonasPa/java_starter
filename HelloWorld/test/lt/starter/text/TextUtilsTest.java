package lt.starter.text;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Andrius on 2015-11-04.
 */
public class TextUtilsTest extends TestCase {
    @Test
    public void testIsPalindrome() throws Exception {
        assertTrue(TextUtils.isPalindrome("sabas"));
        assertFalse(TextUtils.isPalindrome("audi"));
        assertTrue(TextUtils.isPalindrome("kayak"));
        assertTrue(TextUtils.isPalindrome("level"));
        assertFalse(TextUtils.isPalindrome("dell"));
        assertTrue(TextUtils.isPalindrome("AmanaplanacanalPanama"));
    }

    @Test
    public void testRemoveTrashFromString() throws Exception {
        assertEquals("AmanaplanacanalPanama", TextUtils.removeTrashFromString("A man, a plan, a canal: Panama."));

    }

    @Test
    public void testPigLatin() throws Exception {
        assertEquals("hetay uickqay rownbay oxfay", TextUtils.pigLatin("The quick brown fox"));
    }

    @Test
    public void testEncryption() throws Exception {
        assertEquals("hetay", TextUtils.encryption("The"));
        assertEquals("uickqay", TextUtils.encryption("quick"));

    }
}