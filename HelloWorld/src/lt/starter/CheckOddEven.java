package lt.starter;

public class CheckOddEven {   // saved as "CheckOddEven.java"
   public static void main(String[] args) {
      int number = 49;       // set the value of number here!
      System.out.println("The number is " + number);
      if (SequenceTasks.isEven(number)) {
         System.out.println("EVEN NUMBER");
      } else {
         System.out.println("ODD NUMBER");
      }
   }
}