/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical4.Q4;

/**
 *
 * @author oscar
 */
public class Registeration {
    private int regNo;
    private Owner owner;
    private Car car;
    private static int nextRegNo = 1001;
    
    
   public Registeration(Owner owner,Car car){
       regNo=nextRegNo++;
       this.owner=owner;
       this.car=car;
   }
   
    public static int getNextRegNo() {
        return nextRegNo;
    }

    public String toString() {
        return String.format("%-6s %-25s %-35s",regNo,owner,car);
    }
}