package lt.starter.utils;

/**
 * Created by Jonas Pakalnis
 */
/*public class DIAGONALLY {
    public static void main(String[] args) {

        String diag = "DIAGONALLY";
        String word = "";

        for (int i = 0; i < diag.length(); i++) {
            word = diag.substring(i, i + 1);
            word = padLeft(word, i + 1);

            System.out.println(word);
        }
    }

    public static String padLeft(String str, int position) {
        return String.format("%1$" + position + "s", str);
    }

}*/

public class DIAGONALLY {
    public static void main(String[] args) {

        String diag = "DIAGONALLY";
        char word;


        for (int i = 0; i < diag.length(); i++) {
            word = diag.charAt(i);
            for (int s = 0; s < i; s++) {
                System.out.print(' ');
            }
            System.out.println(i+" "+word);

        }
    }


}






