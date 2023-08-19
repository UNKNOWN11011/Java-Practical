/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical.pkg1;
import java.util.*;
/**
 *
 * @author oscar
 */
public class Q2 {
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner scanner = new Scanner(System.in);
    //        //Q2
        final int convertToDays = 365;
        final int convertToHrs = 24;
        final int convertToMinutes = 60;
        final int convertToSec = 60;
        
        System.out.println("====================Configuration: <Default>====================");
        
        System.out.print("Enter your age (years): ");
        int $age = scanner.nextInt();
        
        System.out.println("Age in years: " + $age + " years");
        
        int days= $age * convertToDays;
        System.out.println("Age in days: " + days + " days");
        
        int seconds= days * convertToHrs * convertToMinutes * convertToSec;
        System.out.println("Age in seconds: " + seconds + " seconds\n");
       
        System.out.println("Process completed.");
}
}
