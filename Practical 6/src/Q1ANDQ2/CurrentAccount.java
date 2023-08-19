/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1ANDQ2;

/**
 *
 * @author oscar
 */
class CurrentAccount extends Account {
    private int freeTransactions;
    private double transactionFee;

    public CurrentAccount(int accountNumber, double balance, int freeTransactions, double transactionFee) {
        super(accountNumber, balance);
        this.freeTransactions = freeTransactions;
        this.transactionFee = transactionFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            if (freeTransactions <= 0) {
                balance -= transactionFee;
            }
            freeTransactions--;
        }
    }

    String getBalance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //Q2
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        if (freeTransactions <= 0) {
            balance -= transactionFee;
        }
        freeTransactions--;
    }
    
        @Override
    public String toString() {
        return super.toString() + "\nFree Transactions: " + freeTransactions;
    }

}

