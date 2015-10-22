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
        //Sukuriu nauj� list�, kur d�siu skai�ius
        List<Integer> numbers = new ArrayList<>();
        //Prasuku for cikl�
        for (int anArray : array) {
            //I�renku, kokie skai�iai yra didesni u� nustatyt� graterThan
            if (anArray > greaterThan) {
                //�dedu skai�i� � list� numbers
                numbers.add(anArray);
            }
        }
        //Ne�inau
        array = toIntArray(numbers);
        //Gr��inu array su apsira�ytais skai�ias teste
        return array;
    }


    public static int[] reverseArray(int[] array) {
        //Sukuriu nauj� list�, kur bus reversintas array
        List<Integer> numbers = new ArrayList<>();
        //Suku for cikl�
        for (int i = array.length - 1; i >= 0; i--) {
            // Dedu skai�i� � list� numbers
            numbers.add(array[i]);
        }
        array = toIntArray(numbers);
        //Gr��inu array vis�
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


