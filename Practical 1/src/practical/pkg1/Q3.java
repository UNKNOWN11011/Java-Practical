/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical.pkg1;
import java.util.Scanner;
/**
 *
 * @author oscar
 */
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter credit card no.: ");
        int cardNo = sc.nextInt();// 12345678
        
        int sum1 = 0;
        int sum2 = 0;
        int temp1 = cardNo;
        int temp2 = cardNo / 10; //1234567
        
        for(int i=0;i<8;i += 2){
            int lastdigit = temp1 % 10; //8
            sum1 += lastdigit;
            temp1 /= 100; // 123456
        }
        
        for(int i=0; i < 8; i += 2){
            int lastDigit = temp2 % 10; //7
            int x = lastDigit * 2; //14
            int a = x % 10; // 4
            int b = x % 10; // 1
            
            sum2 += a;
            sum2 += b;
            temp2 /= 100; //12345
        }
        
        int result = sum1 + sum2;
        
        if (result % 10 ==0){
            System.out.println("The credit card is valid");
        }
        else{
            System.out.println("The credit card is not valid");
            System.out.println("The last digit should be " + ((cardNo - result) % 10) +  ".");
        }
          
        
    }

  
  
}
/*run:
Enter an 8-digit credit card number: 12345678
The credit card number is not valid.
The check digit(digit that need to add behind) that would make it valid is: 2
BUILD SUCCESSFUL (total time: 4 seconds)
*/