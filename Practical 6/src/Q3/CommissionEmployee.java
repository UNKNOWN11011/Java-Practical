/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author oscar
 */
class CommissionEmployee extends Employee {
    private double grossSale;
    private double commissionRate;

    
    
    public CommissionEmployee(String name,int yearJoined,double basicSalary, double grossSale, double commissionRate) {
        super(name, yearJoined,basicSalary);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    
  
    @Override
    public String toString(){
            return "Name: " + this.getName()+ ", Year Joined: "+ this.getYearJoined()+ ", Basic salary: " + this.getBasicSalary() + ", Gross sale: "+grossSale + ", Commission Rate: " + commissionRate  ;
    }
    
    

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + grossSale * commissionRate;
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
