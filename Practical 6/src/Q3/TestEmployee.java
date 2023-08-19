/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author oscar
 */
public class TestEmployee {  

  public static void main(String[] args) {
   	Employee[] empArray = new Employee[3];
    	
   	empArray[0] = new Employee("John Smith", 2008, 2500.00);
    empArray[1] = new CommissionEmployee("Wong Fei", 2011, 1000.00, 1500.00, 0.20);
   	empArray[2] = new Clerk("Lim Tong", 1998, 1200.00, 200.00, 12 ,0.03,0.36);
    	
   	printElements(empArray);
    	
  } 
    
  public static void printElements(Employee[] eArray){
   	for(int i = 0; i < eArray.length; i++){
   		if (eArray[i] instanceof CommissionEmployee)
   			System.out.println("\nType of Employee: Commission Employee");
    		else if (eArray[i] instanceof Clerk)
    			System.out.println("\nType of Employee: Clerk");
    		else if(eArray[i] instanceof Employee)
    			System.out.println("\nType of Employee: Employee");
        
    	
                
   		System.out.println("The object's data field values: \n" + eArray[i].toString());
   		System.out.printf("Monthly salary: RM%,.2f\n", eArray[i].calculateSalary());		
   	}
  }
}

/*
run:

Type of Employee: Employee
The object's data field values: 
Name: John Smith, Year Joined: 2008, Basic salary: 2500.0
Monthly salary: RM2,500.00

Type of Employee: Commission Employee
The object's data field values: 
Name: Wong Fei, Year Joined: 2011, Basic salary: 1000.0, Gross sale: 1500.0, Commission Rate: 0.2
Monthly salary: RM1,300.00

Type of Employee: Clerk
The object's data field values: 
Name: Lim Tong, Year Joined: 1998,Basic Salary: 1200.0, Allowance: 200.0, OT Pays: 0.36
Monthly salary: RM1,400.36
BUILD SUCCESSFUL (total time: 0 seconds)

*/