/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical4;
import java.util.Scanner;
/**
 *
 * @author oscar
 */
public class Practical4 {
 
    private String name;
    private double salary;
    
    //construtor
    public Practical4(){
        name ="";
        salary=0.0;
    }
    
     public Practical4(String employeeName){
        name ="";
        salary=0.0;
    }
    
    public Practical4(String employeeName,double currentSalary){
        name=employeeName;
        salary=currentSalary;
    }
    
    //setter/mutator
    public void setName(String employeeName){
        name=employeeName;
    }
    
     public void setSalary(double currentSalary){
         salary =currentSalary;
    }
     
     
    //getter/accessor
     public String getName(){
        return name;
    }
    
     public double getSalary(){
        return salary;
    }
     
     public void raiseSalary(double percent){
         salary = salary + (salary * percent / 100.0);
    }
     
   
    
}
