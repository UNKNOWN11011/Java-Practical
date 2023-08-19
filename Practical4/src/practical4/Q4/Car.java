/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical4.Q4;

/**
 *
 * @author oscar
 */
public class Car {
      private String plateNo;
     private String color;
     private int year;
      private CarType type;
      
        public Car(String plateNo,String color,int year,CarType type){
         this.plateNo=plateNo;
         this.color=color;
         this.year=year;
         this.type=type;
         
     }
        
        public String toString(){
            return String.format("%-10s %-7s %-5s %-15s",plateNo,color,year ,type);
        }
}
