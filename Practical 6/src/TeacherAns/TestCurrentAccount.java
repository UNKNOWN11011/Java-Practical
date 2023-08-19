/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TeacherAns;

/**
 *
 * @author oscar
 */
import java.util.Scanner;
public class TestCurrentAccount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrentAccount c = new CurrentAccount("7788", 10000.00);

        int selection = 4;
        do {
            System.out.println("\n1. Withdrawal");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Quit");
            System.out.print("Enter choice> ");
            selection = scanner.nextInt();

            switch (selection) {

                case 1:
                    System.out.println("\nWITHDRAWAL");
                    System.out.println("----------");
                    System.out.printf("Current balance: RM%.2f\n", c.getBalance());
                    System.out.print("Enter amount: RM");
                    double amount = scanner.nextDouble();
                    if (c.withdraw(amount)) {
                        //c.addTransactionCount();
                        if (c.getTransactionCount() > CurrentAccount.getFreeTransaction()) {
                            c.addTransactionFee();
                        }
                        System.out.printf("Updated balance: RM%.2f\n", c.getBalance());
                    } else {
                        System.out.println("Transaction failed: Insufficient balance.");
                    }
                    break;

                case 2:
                    System.out.println("\nDEPOSIT");
                    System.out.println("-------");
                    System.out.printf("Current balance: RM%.2f\n", c.getBalance());
                    System.out.print("Enter amount: RM");
                    amount = scanner.nextDouble();
                    c.deposit(amount);
                    //c.addTransactionCount();
                    if (c.getTransactionCount() > CurrentAccount.getFreeTransaction()) {
                        c.addTransactionFee();
                    }
                    System.out.printf("Updated balance: RM%.2f\n", c.getBalance());
                    break;

                case 3:
                    System.out.printf("Current balance: RM%.2f\n", c.getBalance());
                    break;

                default:
                    System.out.println("\n\nTerminating program...");
            }
        } while (selection >= 1 && selection <= 3);

    }
}

/*
run:

1. Withdrawal
2. Deposit
3. Check Balance
4. Quit
Enter choice> 1

WITHDRAWAL
----------
Current balance: RM10000.00
Enter amount: RM10000
Updated balance: RM0.00

1. Withdrawal
2. Deposit
3. Check Balance
4. Quit
Enter choice> 2

DEPOSIT
-------
Current balance: RM0.00
Enter amount: RM10000
Updated balance: RM10000.00

1. Withdrawal
2. Deposit
3. Check Balance
4. Quit
Enter choice> 3
Current balance: RM10000.00

1. Withdrawal
2. Deposit
3. Check Balance
4. Quit
Enter choice> 4


Terminating program...
BUILD SUCCESSFUL (total time: 29 seconds)
*/