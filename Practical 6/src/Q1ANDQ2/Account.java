/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1ANDQ2;
import java.util.Date;
/**
 *
 * @author oscar
 */

class Account {
    private int accountNumber;
    double balance;
    private Date dateCreated;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    
     @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\nBalance: $" + balance + "\nDate Created: " + dateCreated;
    }
    
    //Q2
      @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account otherAccount = (Account) obj;
        return this.accountNumber == otherAccount.accountNumber;
    }
}
