/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical4;
import java.util.*;

//Q1
public class Employee {
    //Make the data fields private.
  private String name;
  private double salary;
    /**
     * @param args the command line arguments
     */
  //setters
public Employee(String employeeName, double currentSalary) {
name = employeeName;
salary = currentSalary;
}  

public void raiseSalary(double percent){
salary = salary + (salary * percent / 100.0);
}
//All constructors and methods should be declared as public.
public String getName(){ //getter
    return name;
}

public double getSalary(){ //getter
    return salary;
}

public static void main(String args[]){
    Employee emp =new Employee("Johnny  Deep",5000.0);
    Employee emp1 = new Employee("Oscar Ding",10000.0);
    
    System.out.println("Name of the employee: " + emp.getName());
    System.out.println("Salary before raise: " + emp.getSalary());
    emp.raiseSalary(8);
    System.out.println("Salary after raise: " + emp.getSalary());
     System.out.println("Name of the employee: " + emp1.getName());
    System.out.println("Salary before raise: " + emp1.getSalary());
    emp1.raiseSalary(8);
    System.out.println("Salary after raise: " + emp1.getSalary());
    System.out.println("");
    
    if(emp.getSalary()> emp1.getSalary())
        System.out.println("The employee with the a higher salary is " + emp.getName() + ".");
    else if(emp.getSalary()< emp1.getSalary())
        System.out.println("The employee with the a higher salary is " + emp1.getName()+ ".");
    else
        System.out.println("Their salaries are equal.");
    
   double total = emp.getSalary()+emp1.getSalary();
    System.out.printf("The total salary after raise of the 2 employees is RM%.2f.\n",total);
   
}
}

/*
run:
Name of the employee: Johnny  Deep
Salary before raise: 5000.0
Salary after raise: 5400.0
Name of the employee: Oscar Ding
Salary before raise: 10000.0
Salary after raise: 10800.0

The employee with the a higher salary is Oscar Ding.
BUILD SUCCESSFUL (total time: 0 seconds)
*/