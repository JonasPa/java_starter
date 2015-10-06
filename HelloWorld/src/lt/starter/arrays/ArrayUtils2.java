package lt.starter.arrays;

/**
 * Created by Jonas Pakalnis
 */
public class ArrayUtils2 {

    public static boolean contains(int[] array, int number){
        for (int element : array){
            if (number == element) {
                return true;
            }
            
        }
        return false;
    }
}
