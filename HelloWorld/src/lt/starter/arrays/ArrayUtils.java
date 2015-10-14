package lt.starter.arrays;

import java.util.ArrayList;
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
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != numberToRemove) {
                numbers.add(array[i]);
            }
        }
        array = toIntArray(numbers);
        return array;
    }
}
