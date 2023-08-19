/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical4.Q4;

/**
 *
 * @author oscar
 */
public class Owner {
    private String name;
     private String ic;
     
     public Owner(String name,String ic){
         this.name = name;
         this.ic=ic;
     }
     
     public String toString(){
         return String.format("%-15s %-10s",name,ic);
     }
}
