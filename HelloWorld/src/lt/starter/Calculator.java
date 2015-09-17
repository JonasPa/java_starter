package lt.starter;

import java.util.Scanner;

public class Calculator {
     public static void main(String args[]){
        Scanner calculator = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first num: ");
        fnum = calculator.nextDouble();
        System.out.println("Enter second num: ");
        snum = calculator.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);
        System.out.println("Enter first num: ");
        fnum = calculator.nextDouble();
        System.out.println("Enter second num: ");
        snum = calculator.nextDouble();
        answer = fnum * snum;
        System.out.println(answer);




}


}