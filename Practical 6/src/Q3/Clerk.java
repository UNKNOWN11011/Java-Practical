/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author oscar
 */
class Clerk extends Employee {
    private double allowance;
    private int overtimeHours;
    private static double overtimeRate= 0.03;
    private double overtimePay;

    //constructors
    public Clerk(String name,int yearJoined, double basicSalary, double allowance, int overtimeHours,double ovetimeRate,double overtimePay) {
        super(name,yearJoined,basicSalary);
        this.allowance = allowance;
        this.overtimeHours=overtimeHours;
        this.overtimeRate=overtimeRate;
        this.overtimePay=overtimePay;
        
      
    }
    
    //getters/accessor
    public double getAllowance() {
        return allowance;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public static double getOvertimeRate() {
        return overtimeRate;
    }
    
    //setters/mutators

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public static void setOvertimeRate(double overtimeRate) {
        Clerk.overtimeRate = overtimeRate;
    }
//    
//    public double calOvertimePay(){
//        return overtimePay=  overtimeHours * Clerk.overtimeRate;
//    }
//    
//    
      @Override
    public String toString(){
        
        return "Name: " + this.getName() + ", Year Joined: "+ this.getYearJoined() + ",Basic Salary: "+ this.getBasicSalary() +", Allowance: "+allowance + ", OT Pays: "+ overtimePay ;
    }
    

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + allowance + (overtimeHours*overtimeRate);
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
        return this.getName().equals(otherEmployee.getName());
    }


}
