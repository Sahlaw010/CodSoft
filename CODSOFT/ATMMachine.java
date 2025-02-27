
/*
 * @author Sachin Ahlawat.
 */
import java.util.Scanner;

public class ATMMachine {

    public static void main(String args[]) {

        int balance = 100000, withdraw, deposit;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to ATM:");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            int choice = sc.nextInt();

            while (choice > 4 && choice <= 0) {
                System.out.println("Please enter the choice between 1-4!!");
                choice = sc.nextInt();
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");

                    withdraw = sc.nextInt();

                    if (balance >= withdraw) {

                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {

                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");

                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully depsited");
                    System.out.println("");
                    break;

                case 3:

                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

                case 4:

                    System.exit(0);
            }
            sc.close();
        }
    }
}