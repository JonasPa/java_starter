package lt.starter.arrays;

import junit.framework.TestCase;

/**
 * Created by Andrius on 2015-11-04.
 */
public class StringArrayListTest extends TestCase {

    public void testGet() throws Exception {

    }

    public void testSet() throws Exception {
        StringArrayList myList = new StringArrayList();
        myList.set("test", 0);
        assertEquals("test", myList.get(0));

    }
}