package lt.starter;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Andrius-PC on 2015-09-29.
 */
public class GreaterOrEqual {
/*    public static void main(String[] args) {
        int[] array = {5, 8, 8, 9, 7, 7, 6, 9, 4, 6, 21, 12};
        System.out.println(Arrays.toString(array));
        int V = 6;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            {
                if (array[i] == V) {
                    array [i] = V - array[i];
                    index = i;
                }
            }

        }
        System.out.println(Arrays.toString(array));
    }*/

    public static void main(String[] args) {
        int[] array = {5, 8};
        System.out.println(Arrays.toString(array));
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
        System.out.println(Arrays.toString(array));
                }
            }