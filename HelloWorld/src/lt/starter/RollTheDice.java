package lt.starter;

public class RollTheDice {
    public static void main(String[] args) {

        int die1 = rollDice();
        int die2 = rollDice();
        int roll = die1 + die2;
        int countRolls = 0;
        while (isNotSnakeEyes()){
            countRolls++;
        }
        System.out.println("It took " + countRolls + " rolls to get snake eyes.");
    }


    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }


    public static boolean isNotSnakeEyes() {
        return !(rollDice() == 1 && rollDice() == 1);
    }
}