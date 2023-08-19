/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TeacherAns;

/**
 *
 * @author oscar
 */
public class CurrentAccount extends Account {

    private static int freeTransactionCount = 2;
    private static double transactionFee = 1.0;
    private int transactionCount;

    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
        transactionCount = 0;
    }

    // getter / accessor
    public static int getFreeTransaction() {
        return freeTransactionCount;
    }

    public static double getTransactionFee() {
        return transactionFee;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    // other methods
    public void addTransactionCount() {
        transactionCount++;
    }

    public void deductTransactionFee() {
        super.withdraw(transactionFee);
    }

    // Q2(a)
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        addTransactionCount();

        if (transactionCount > freeTransactionCount) {
            deductTransactionFee();
        }
    }

    @Override
    public boolean withdraw(double amount) {
        boolean success = super.withdraw(amount);
        if (success) {
            addTransactionCount();

            if (transactionCount > freeTransactionCount) {
                deductTransactionFee();
            }
        }
        
        return success;
    }
    
    // Q2(b)
    @Override
    public String toString(){
        return super.toString() + 
                "Transaction Count: " + transactionCount + "\n";
    }

    void addTransactionFee() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}