import java.util.Scanner;

import Transactions.Deposit;
import Transactions.Withdraw;

public class Main {

  public static void main(String args[]) {
    // declare and initialize balance, withdraw, and deposit

    int balance = 1000;
    int withdraw;
    int deposit;
    
    // create scanner class object to get choice of user
    Scanner sc = new Scanner(System.in);

    boolean atm = true;
    while (atm) {
      System.out.println("");
      System.out.println(
            "***************************\n" + 
            "*** Welcome to YOUR ATM ***\n" + 
            "***************************\n");
      System.out.println("Please select an option:");
      System.out.println("");
      System.out.println("Option 1 Check your Balance");
      System.out.println("Option 2 Make a Deposit");
      System.out.println("Option 3 Make a Withdrawal");
      System.out.println("Option 4 for EXIT");

      // account holder inputs choices
      System.out.print("Input: ");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          // display current balance
          
          System.out.println("");
          System.out.println("Your Current Balance is : $" + balance);
         
          break;

        case 2:

          System.out.print("Enter Dollar Amount for Deposit: $");

          // deposit option
          deposit = sc.nextInt();
          balance = balance + deposit;
          System.out.println("");
          System.out.println("You Have Deposited $" + deposit);
          System.out.println("Your current balance is $" + balance);
          Deposit.makeDeposit(); 
          
          break;

        case 3:
          System.out.print("Enter Dollar Amount for Withdrawal: $");
          // withdraw option
          withdraw = sc.nextInt();

          // determine if there is sufficient funds available
          if (balance >= withdraw) {
            balance = balance - withdraw;
            System.out.println("");
            System.out.println("You Have Withdrawn $" + withdraw);
            System.out.println("Your current balance is $" + balance);
            Withdraw.makeWithdrawal(); 
            
          }

          else {

            System.out.println("");
            System.out.println("You Have Insufficient Balance.");
            Withdraw.makeWithdrawal(); 
            
          }
          
          break;

        case 4:
          // exit from the menu
          System.out.println("");
          System.out.println("The session is now closed.");
          System.out.println("Thank your for using YOUR ATM");
          System.out.println("");
          System.exit(0);
          sc.close();

      }
    }
  }
}