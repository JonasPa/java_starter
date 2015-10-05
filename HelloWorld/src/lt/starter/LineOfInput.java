package lt.starter;

public class LineOfInput {   // saved as "LineOfInput.java"
   public static void main(String[] args) {
      String diag = "He said\"That's not a good idea.\"";
            char letter;
      for (int i = 0; i < diag.length(); i++) {
         letter = diag.charAt(i);
            if (Character.isLetter(letter))
            System.out.print(letter);
         else
            System.out.println(' ');
      }
   }
}


