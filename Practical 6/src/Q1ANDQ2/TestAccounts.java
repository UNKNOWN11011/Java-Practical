/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1ANDQ2;

/**
 *
 * @author oscar
 */
public class TestAccounts {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(12345, 1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(54321, 2000, 3, 2.5);

        savingsAccount.deposit(500);
        savingsAccount.addInterest();
        savingsAccount.withdraw(200);

        currentAccount.deposit(300);
        currentAccount.withdraw(100);
        currentAccount.withdraw(50);
        currentAccount.withdraw(21);

      System.out.println("Savings Account Details:\n" + savingsAccount);
        System.out.println("Current Account Details:\n" + currentAccount);
    }
}