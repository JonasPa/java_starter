package lt.starter;

public class TimeTable {
   public static void main (String[] args) {
      int size = 9;
      int margins = 16;
      System.out.print("* |  ");
      for (int row = 1; row <=9; row++){
         System.out.print("  "+ row);
      }
      System.out.println();
      for (int row = 1; row <=margins; row++){
         System.out.print("- ");
      }
      System.out.println();
      for (int row = 1; row <= size; row++) {
         System.out.print(row+ " | ");
         for (int col = 1; col <= size; col++){
            int product = row * col;
            if ( product < 10) {
               System.out.print(" ");
            }
            System.out.print(" " + product);
         }
         System.out.println();
      }
      System.out.println();
   }
}