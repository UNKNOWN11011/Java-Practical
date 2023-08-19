/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1ANDQ2;

/**
 *
 * @author oscar
 */
class SavingsAccount extends Account {
    private final double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

   
    public double calculateInterest() {
        return balance * interestRate;
    }

    public void addInterest() {
        double interest = calculateInterest();
        deposit(interest);
    }

    String getBalance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}