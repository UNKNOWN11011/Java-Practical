/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1ANDQ2;
import java.util.Scanner;
/**
 *
 * @author oscar
 */

public class CurrentAccountClient {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount(54321, 2000, 3, 2.5);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amount = scanner.nextDouble();
                currentAccount.deposit(amount);
                System.out.println("Deposit successful.");
            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double amount = scanner.nextDouble();
                currentAccount.withdraw(amount);
                System.out.println("Withdrawal successful.");
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("Current Account Balance: " + currentAccount.getBalance());
    }
}

/*
run:
Menu:
1. Deposit
2. Withdraw
3. Exit
Enter your choice: 1
Enter deposit amount: 1000
Deposit successful.
Menu:
1. Deposit
2. Withdraw
3. Exit
Enter your choice: 2
Enter withdrawal amount: 1100
Withdrawal successful.
Menu:
1. Deposit
2. Withdraw
3. Exit
Enter your choice: 3
*/