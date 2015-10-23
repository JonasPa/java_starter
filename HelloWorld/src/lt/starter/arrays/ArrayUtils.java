package lt.starter.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static lt.starter.SequenceTasks.toIntArray;

/**
 * Created by Andrius-PC on 2015-10-06.
 */
public class ArrayUtils {
    public static int[] collectGreaterThan(int greaterThan, int[] array) {
        //Sukuriu naujà listà, kur dësiu skaièius
        List<Integer> numbers = new ArrayList<>();
        //Prasuku for ciklà
        for (int anArray : array) {
            //Iğrenku, kokie skaièiai yra didesni uş nustatytà graterThan
            if (anArray > greaterThan) {
                //Ádedu skaièiø á listà numbers
                numbers.add(anArray);
            }
        }
        //Neşinau
        array = toIntArray(numbers);
        //Gràşinu array su apsirağytais skaièias teste
        return array;
    }


    public static int[] reverseArray(int[] array) {
        //Sukuriu naujà listà, kur bus reversintas array
        List<Integer> numbers = new ArrayList<>();
        //Suku for ciklà
        for (int i = array.length - 1; i >= 0; i--) {
            // Dedu skaièiø á listà numbers
            numbers.add(array[i]);
        }
        array = toIntArray(numbers);
        //Gràşinu array visà
        return array;
    }

    public static boolean contains(int number, int[] array) {
        for (int anArray : array) {
            if (anArray == number) {
                return true;
            }
        }
        return false;
    }

    public static int[] removeFromArray(int numberToRemove, int[] array) {
        int index = ArrayUtils.indexOf(numberToRemove, array);
        array = ArrayUtils.removeByIndex(index, array);
        return array;
    }

    public static int[] insert(int number, int index, int[] array) {
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = number;
        return array;
    }

    public static int indexOf(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static int[] removeByIndex(int index, int[] array) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        return array;
    }
}
