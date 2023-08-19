/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TeacherAns;

/**
 *
 * @author oscar
 */
public class SavingAccount extends Account{
    private static double interestRate = 0.02;
    
    public SavingAccount(String accNo, double balance){
        super(accNo, balance);
    }
    
    // getter / accessor
    public static double getInterestRate(){
        return interestRate;
    }
    
    // setter / mutator
    public static void setInterestRate(double interestRate){
        SavingAccount.interestRate = interestRate;
    }
    
    // other methods
    public double calInterest(){
        return super.getBalance() * interestRate / 12;
    }
    
    public void addInterest(){
        super.deposit(calInterest());
    }
}