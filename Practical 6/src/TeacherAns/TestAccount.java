/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TeacherAns;

/**
 *
 * @author oscar
 */
public class TestAccount {
    public static void main(String [] args){
		Account a = new Account("98765", 5000);
	  SavingAccount s = new SavingAccount("12345", 2000);
	  CurrentAccount c = new CurrentAccount("77880", 1000);
	    
	  System.out.println("Account info: \n" + a.toString());
	  System.out.println("\nSavings account info: \n" + s.toString());
	  
	  c.withdraw(100.00);
	  c.deposit(500.00);
	  c.withdraw(200.00);
	  System.out.println("\nCurrent account info: \n" + c.toString());
	  
	  SavingAccount s2 = new SavingAccount("12345", 5000);
	  SavingAccount s3 = new SavingAccount("12344", 2200);
	  
	  System.out.println("\ns equals s2: " + s.equals(s2));
	  System.out.println("s equals s3: " + s.equals(s3));
	 }
}

/*
run:
Account info: 
Account Number: 98765
Balance: 5000.0


Savings account info: 
Account Number: 12345
Balance: 2000.0


Current account info: 
Account Number: 77880
Balance: 1199.0
Transaction Count: 3


s equals s2: true
s equals s3: false
BUILD SUCCESSFUL (total time: 0 seconds)
*/