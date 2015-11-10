package lt.starter.arrays;

import java.util.ArrayList;
import java.util.List;

import static lt.starter.utils.SequenceTasks.toIntArray;

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

    public static int[] subArrays(int[] array, int startIndex, int endIndex) {
        int[] myIntArray = new int[endIndex - startIndex];
        for (int i = startIndex, j = 0; i < endIndex; i++, j++) {
            myIntArray[j] = array[i];
        }
        return myIntArray;
    }

    public static int[] revertArray(int[] array) {
        int[] myIntArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            myIntArray[i] = array[array.length - i - 1];

        }
        return myIntArray;
    }

    public static int lastIndexOf(int number, int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
            }
        }
        return index;
    }

    public static int[] arraySet(int index, int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = number;
            }
        }
        return array;
    }

    public static int sumNumbersInArrays(int[] array1, int[] array2) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sum += array2[i];
        }
        return sum;
    }

    public static int[] sumOfArray(int[] firstArray, int[] secondArray) {
        int[] sumArrays = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            sumArrays[i] = firstArray[i];
        }
        for (int i = 0, j = firstArray.length; i < secondArray.length; i++, j++) {
            sumArrays[j] = secondArray[i];
        }
        return sumArrays;
    }

    public static boolean isEquals(int[] primaryArray, int[] anotherArray) {
        if (primaryArray.length == anotherArray.length) {
            for (int i = 0; i < primaryArray.length; i++) {
                primaryArray[i] = anotherArray[i];
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean containsArray(int[] primaryArray, int[] secondArray) {
        if (secondArray.length == 0) {
            return false;
        }
        int index = 0;
        boolean foundStart = false;
        for (int i = 0; i < primaryArray.length; i++) {
            //Tikrinu, kada pirmo arrayjaus indexas bus lygus mano arrayjaus pirm�jam skai�iui
            if (primaryArray[i] == secondArray[index]) {
                //Ne�inau
                foundStart = true;
                //Didinu index�
                index++;
                //Tikrinu, ar index'as pasiek� antro arrajaus pabaig�
                if (index == secondArray.length) {
                    return true;
                }
            } else {
                //Ne�inau
                if (foundStart) {
                    return false;
                }
            }
        }
        return false;
    }

    public static int[] removeFromArray(int[] firstArray, int[] arrayToRemove) {
        boolean areInArray = ArrayUtils.containsArray(firstArray, arrayToRemove);
        if (areInArray) {
            int firstNumber = indexOf(arrayToRemove[0], firstArray);
            int secondNumber = indexOf(arrayToRemove[arrayToRemove.length - 1], firstArray);
            int[] firstSection = ArrayUtils.subArrays(firstArray, 0, firstNumber);
            int[] secondSection = ArrayUtils.subArrays(firstArray, secondNumber + 1, firstArray.length);

            return ArrayUtils.sumOfArray(firstSection, secondSection);

        }
        return firstArray;
    }

    public static int[] sort(int... sortToArray) {
        for (int i = 0; i < sortToArray.length-1; i++) {
            for (int a = 1; a < sortToArray.length; a++) {
                if (sortToArray[a-1] > sortToArray[a]){
                    int toSort = sortToArray[a-1];
                    sortToArray[a-1] = sortToArray[a];
                    sortToArray[a] = toSort;
                }
            }
        }
        return sortToArray;
    }
}