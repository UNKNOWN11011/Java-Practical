/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical4;

/**
 *
 * @author oscar
 */
public class Q1teahcerAnswer {
    public static void main(String[] args) {
    Practical4 emp1 =new Practical4("Ali");
    Practical4 emp2 = new Practical4("Abu",3500);
    emp1.setSalary(2500);
    
    //1(a)
    System.out.println("Salary of " + emp1.getName()+ ":" + emp1.getSalary());
    emp1.raiseSalary(8);
    System.out.println("Salary of " + emp1.getName()+ "after raising 8%:" + emp1.getSalary());
    
    
    //1c)
     if(emp1.getSalary()> emp2.getSalary())
        System.out.println(emp1.getName() + " has higher salary than " + emp2.getName());
    else 
        System.out.println(emp2.getName() + " has higher salary than " + emp1.getName());
    
    
      System.out.println("Total salary of the 2 employees is "+ (emp2.getSalary() +emp1.getSalary()));
}
    }
/*
run:
Salary of :2500.0
Salary of after raising 8%:2700.0
Abu has higher salary than 
Total salary of the 2 employees is 6200.0
BUILD SUCCESSFUL (total time: 0 seconds)
*/