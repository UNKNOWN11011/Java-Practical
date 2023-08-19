/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author oscar
 */
public class Employee {
    private String name;
     private int yearJoined;
    private double basicSalary;
    

    //constructor
    public Employee(String name,int yearJoined, double basicSalary) {
        this.name = name;
        this.yearJoined=yearJoined;
        this.basicSalary = basicSalary;
    }

     public Employee(String name,int yearJoined) {
        this.name = name;
        this.yearJoined=yearJoined;
    }


  
    //getters/accessors
    public String getName() {
        return name;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    //setters/mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

  
     
    public String toString(){
        return "Name: " + name + ", Year Joined: "+ yearJoined + ", Basic salary: " + basicSalary  ;
    }
    
    
    public double calculateSalary() {
        return basicSalary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee otherEmployee = (Employee) obj;
//        return this.name.equals(otherEmployee.name);
//    }

    //Q3C
        // Comparing both name and employeeId to ensure uniqueness
        return this.name.equals(otherEmployee.name);
    }

}
