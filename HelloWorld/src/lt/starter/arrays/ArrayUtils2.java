package lt.starter.arrays;

import java.util.Arrays;

/**
 * Created by Jonas Pakalnis
 */
public class ArrayUtils2 {

    public static boolean contains(int[] array, int number) {
        for (int element : array) {
            if (number == element) {
                return true;
            }

        }
        return false;
    }

    public static int[] revert(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < reverseArray.length; i++) {
            int number = array[array.length - i - 1];
            reverseArray[i] = number;
        }
        return reverseArray;
    }

    public static int[] subArray(int[] array, int from, int to) {
        int[] myIntArray = new int[to - from];
        for (int i = from; i < to; i++) {
            myIntArray[i - from] = array[i];
        }
        return myIntArray;
    }


    public static int lastIndexOf(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int i : array){
            sum += i;

        }
        return sum;
    }


    public static int[] removeArray(int index, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                index++;
                array[i] = 0;

            }

        }

        return array;
        }
    }