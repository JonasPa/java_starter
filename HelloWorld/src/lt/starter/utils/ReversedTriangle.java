package lt.starter.utils;

/**
 * Created by Andrius on 2015-11-03.
 */
public class ReversedTriangle {
    public static void main(String[] args) {
        //Trikampio dydis
        int size = 5;
        //Spausdina eilutes
        for (int a = 0; a < size; a++) {
            System.out.println(' ');
            //I�spausdina br�k�niukus prie� kiekvien� skai�i�
            for (int b = 0; b < a; b++) {
                System.out.print("-");
            }
            //I�spausdina skai�ius i, ir kaskart ma�ina
            for (int i = 1; i <= size - a; i++) {
                System.out.print(i);
            }
        }
    }
}
