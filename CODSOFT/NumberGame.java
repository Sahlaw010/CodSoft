/*
 * @author Sachin Ahlawat.
 */

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    static void GuessNum() {
        int minRange = 1;
        int maxRange = 100;
        int maxLimit = 3;
        Random random = new Random();
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        System.out.println("Your number will lie between 1-100.");

        for (int i = 1; i <= maxLimit; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the guess number: ");
            int GuessNum = sc.nextInt();
            if (GuessNum == randomNumber) {
                System.out.println("The user has guessed the number correctly.");
                System.out.println();
                break;
            } else if (GuessNum > randomNumber) {
                System.out.println("The guess is higher than the random number.");
                System.out.println();
            } else if (GuessNum < randomNumber) {
                System.out.println("The guess is lower than the random number.");
                System.out.println();
            } else if (GuessNum < 0 && GuessNum > 100) {
                System.out.println("Invalid number.");
            }
            if (i == maxLimit) {
                System.out.println("You have reached the maximum limit, you cannot guess further.");
                System.out.println("Your number was :" + randomNumber);
            }
            sc.close();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to the Number Game!");
            System.out.println("Each user will get 5 rounds to play and each round will have 3 guesses.");
            System.out.println("Play accordingly.");
            System.out.println();
            GuessNum();

            for (int i = 1; i < 6; i++) {
                System.out.println("Play Again?");
                System.out.println("Press 1 for yes 2 for no");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println();
                    GuessNum();
                } else if (choice == 2) {
                    System.out.println("Thank you for playing!");
                    break;
                }

            }
        }
    }

}
