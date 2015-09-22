package lt.starter.currency;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Jonas Pakalnis
 */
public class CurrencyTest {
    @Test
    public void testCountDollars() throws Exception {
        //5 x 0,25 = 1,25
        //1 x 10   = 10
        //0 x 5 = 0
        //3 x 1 = 3
        assertEquals(1.38, Currency.countDollars(5, 1, 0, 3));
        assertEquals(0.0, Currency.countDollars(0, 0, 0, 0));
    }
}