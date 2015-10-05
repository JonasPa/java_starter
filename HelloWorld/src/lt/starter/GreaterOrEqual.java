package lt.starter;

import java.util.Arrays;


/**
 * Created by Andrius-PC on 2015-09-29.
 */
public class GreaterOrEqual {
    public static void main(String[] args) {
        int[] array = {5, 8, 8, 9, 7, 7, 6, 9, 4, 6, 21, 12};
        int V = 33;
        int index = 6;
        System.out.println(Arrays.toString(array));
        for (int i = array.length - 1; i >= index; i--) {
            array[i] = array[i - 1];
            array[i-1] = V;


        }
        System.out.println(Arrays.toString(array));
    }
}