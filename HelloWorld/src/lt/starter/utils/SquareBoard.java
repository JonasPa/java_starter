package lt.starter.utils;

public class SquareBoard {   // saved as "SquareBoard.java"
   public static void main (String[] args) {
      int size = 5 ;   // size of the board
         for (int col = 0; col <=5; col++ ) {
            for (int row = 1; row <=size; row++ ) {
               System.out.print("#");
            }
            System.out.println();
         }
      }
   }
