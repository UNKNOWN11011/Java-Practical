/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical3;
import java.util.Scanner;
/**
 *
 * @author oscar
 */
public class teacherANS {
    //Q3
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int[] denomination={100,50,20,10,5,1};
        int[] qty=new int[denomination.length];
        int[] value=new int[denomination.length];
        int total=0;
        
        System.out.println("Denomination (RM) \t Quantity");
        for(int i=0;i<denomination.length;i++){
             System.out.printf("%12d \t ",denomination[i]);
             qty[i]=scanner.nextInt();
             value[i]= denomination[i]*qty[i];
             total+=value[i];
             
        }
        
        System.out.println("Denomination (RM) \t Quantity \t Value (RM)");
        for(int i=0;i<denomination.length;i++){
            if(qty[i]>0)
             System.out.printf("%14d \t\t %6d \t\t %2d\n",denomination[i],qty[i],value[i]);
            
        }
              
        System.out.println("Total = RM " + total);    
    }
}
/*
run:
Denomination (RM) 	 Quantity
         100 	         26
          50 	         87
          20 	         96
          10 	         0
           5 	         33
           1 	         145
Denomination (RM) 	 Quantity 	 Value (RM)
           100 		     26 		2600
            50 		     87 		4350
            20 		     96 		1920
             5 		     33 		 165
             1 		    145 		 145
Total = RM 9180
BUILD SUCCESSFUL (total time: 20 seconds)

*/