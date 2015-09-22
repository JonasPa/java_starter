package lt.starter.currency;

import java.text.DecimalFormat;

/**
 * Created by Jonas Pakalnis
 */
public class Currency {
    private Currency(){}
    public static double countDollars(int quarters, int dimes, int nicklies, int pennies){
        double dollars = (quarters*0.25)+(dimes*0.1)+(nicklies*0.05)+(pennies*0.01);
        return Math.floor(dollars * 100) / 100;
    }
}
