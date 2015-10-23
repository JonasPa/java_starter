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

    public static boolean containsArray(int[] primaryArray, int[] secondArray){
        int index = 0;
        boolean foundStart = false;
        for (int i = 0; i < primaryArray.length; i++) {
            //Tikrinu, kada pirmo arrayjaus indexas bus lygus mano arrayjaus pirmàjam skaièiui
            if (primaryArray[i] == secondArray[index]){
                //Neşinau
                foundStart = true;
                //Didinu indexà
                index++;
                //Tikrinu, ar index'as pasiekë antro arrajaus pabaigà
                if(index == secondArray.length){
                    return true;
                }
            } else {
                //Neşinau
                if (foundStart){
                    return false;
                }
            }
        }
        return false;
    }

    public static int[] removeFromArray (int[] firstArray, int[] secondArray){
        boolean first = ArrayUtils.containsArray(firstArray, secondArray);





        return null;
    }
}