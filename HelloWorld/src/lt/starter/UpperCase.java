package lt.starter;

public class UpperCase {
   public static String capitalize(String text){
      String capitalize = "";
      for (int i= 0; i<text.length(); i++) {
         char symbol = text.charAt(i);
         char upperCaseLetter = Character.toUpperCase(symbol);
         capitalize = capitalize+upperCaseLetter;


      }
   return capitalize ;
   }
}