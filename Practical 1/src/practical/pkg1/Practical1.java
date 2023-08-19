/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical.pkg1;
import java.util.*;
/**
 *
 * @author oscar
 */
public class Practical1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner scanner = new Scanner(System.in);
//      //Q1
//        System.out.print("Enter name: ");
//        String name = scanner.nextLine();
//        
//         System.out.print("\nEnter your year of study: ");
//        int yearOfstudy = scanner.nextInt();
//        
//         System.out.print("\nWhat is your target GPA for this semester? ");
//        double gpa = scanner.nextDouble();
//        
//        System.out.println("\nWelcome " + name + "!");
//        System.out.printf("Work hard to achieve your target GPA of %.2f this semester of your Year " + yearOfstudy + ".\n", gpa);
//       
        /*run:
Enter name: Pang Jun Meng

Enter your year of study: 2

What is your target GPA for this semester? 4.00

Welcome Pang Jun Meng!
Work hard to achieve your target GPA of 4.00 this semester of your Year 2.
BUILD SUCCESSFUL (total time: 11 seconds)
*/
        
//        //Q2
//        final int convertToDays = 365;
//        final int convertToHrs = 24;
//        final int convertToMinutes = 60;
//        final int convertToSec = 60;
//        
//        System.out.println("====================Configuration: <Default>====================");
//        
//        System.out.print("Enter your age (years): ");
//        int $age = scanner.nextInt();
//        
//        System.out.println("Age in years: " + $age + " years");
//        
//        int days= $age * convertToDays;
//        System.out.println("Age in days: " + days + " days");
//        
//        int seconds= days * convertToHrs * convertToMinutes * convertToSec;
//        System.out.println("Age in seconds: " + seconds + " seconds\n");
//       
//        System.out.println("Process completed.");
//        
        /*
        run:
====================Configuration: <Default>====================
Enter your age (years): 20
Age in years: 20 years
Age in days: 7300 days
Age in seconds: 630720000 seconds

Process completed.
BUILD SUCCESSFUL (total time: 30 seconds)
        */
        
        //Q3
        System.out.print("Enter an 8-digit credit card number: ");
        int creditCardNumber = scanner.nextInt();

        boolean isValid = validateCreditCard(creditCardNumber);

        if (isValid) {
            System.out.println("The credit card number is valid.");
        } else {
           int checkDigit = findCheckDigit(creditCardNumber);
            System.out.println("The credit card number is not valid.");
            System.out.println("The check digit(digit that need to add behind) that would make it valid is: " + checkDigit);
        }
    }

    public static boolean validateCreditCard(int creditCardNumber) {
        int sum = 0;
        boolean doubleDigit = false;

        while (creditCardNumber > 0) {
            int digit = creditCardNumber % 10;

            if (doubleDigit) {
                digit *= 2;
                digit = (digit % 10) + (digit / 10);
            }

            sum += digit;
            creditCardNumber /= 10;
            doubleDigit = !doubleDigit;
        }

        return sum % 10 == 0;
    }

    public static int findCheckDigit(int creditCardNumber) {
        int sum = 0;
        boolean doubleDigit = true;

        while (creditCardNumber > 0) {
            int digit = creditCardNumber % 10;

            if (doubleDigit) {
                digit *= 2;
                digit = (digit % 10) + (digit / 10);
            }

            sum += digit;
            creditCardNumber /= 10;
            doubleDigit = !doubleDigit;
        }

        int checkDigit = (10 - (sum % 10)) % 10;
        return checkDigit;
    
    }
}

        /*run:
Enter an 8-digit credit card number: 12345678
The credit card number is not valid.
The check digit(digit that need to add behind) that would make it valid is: 2
BUILD SUCCESSFUL (total time: 4 seconds)

        */
/*run:
Enter an 8-digit credit card number: 123456782
The credit card number is valid.
BUILD SUCCESSFUL (total time: 3 seconds)
*/

    
 

        


