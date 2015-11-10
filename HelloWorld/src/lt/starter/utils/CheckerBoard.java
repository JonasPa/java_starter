package lt.starter.utils;

public class CheckerBoard {   // saved as "CheckerBoard.java"
   public static void main (String[] args) {
      int size = 7;    // size of the board

      for (int row = 1; row <= size; row++) {
         // Use modulus 2 to find alternate lines
         if (SequenceTasks.isEven(row)) {   // row 2, 4, 6, 8
            System.out.print(' ');
         }
         for (int col = 0; col <= size; col++) {
            System.out.print('#');
         }
        System.out.println();
      }
   }
}