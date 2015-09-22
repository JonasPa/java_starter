package lt.starter;

public class RollTheDice {
   public static void main(String[] args) {
     int die1 = rollDice();
     int die2 = rollDice();
     int roll = die1 + die2;

      System.out.println("Pirmas metimas = " + die1);
      System.out.println("Antras metimas = " + die2);
      System.out.println("Metimu suma = " + roll);
   }
    private static int rollDice() {
        return (int)(Math.random()*6) + 1;
    }
}