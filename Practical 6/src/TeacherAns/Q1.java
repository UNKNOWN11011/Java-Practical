/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TeacherAns;

/**
 *
 * @author oscar
 */
public class Q1 {
    public static void main(String[] args) {
        SavingAccount savingAcc=new SavingAccount("123",1000);
        CurrentAccount currentAcc=new CurrentAccount("456",1000);
        
       //current account test
        System.out.println("The current account "+currentAcc.getAccNo()+" has balance of "+currentAcc.getBalance()+ ".");
        currentAcc.deposit(100);
        System.out.println("The current account "+currentAcc.getAccNo()+" has balance of "+currentAcc.getBalance()+ " after deposit.");
        
           if(!currentAcc.withdraw(2000)){
             System.out.println("Withdrawal had exceed balance.");
           }
             System.out.println("The current account "+currentAcc.getAccNo()+" has balance of "+currentAcc.getBalance()+ " after withdraw.");
             
              //saving account test
                     System.out.println("The current account "+savingAcc.getAccNo()+" has balance of "+savingAcc.getBalance()+ ".");
             savingAcc.addInterest();
               System.out.println("The current account "+savingAcc.getAccNo()+" has balance of "+savingAcc.getBalance()+ " after adding interest.");
        
    }
}

/*
run:
The current account 456 has balance of 1000.0.
The current account 456 has balance of 1100.0 after deposit.
Withdrawal had exceed balance.
The current account 456 has balance of 1100.0 after withdraw.
The current account 123 has balance of 1000.0.
The current account 123 has balance of 1001.6666666666666 after adding interest.
BUILD SUCCESSFUL (total time: 0 seconds)

*/