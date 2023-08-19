/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical.pkg2;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Practical2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        //Q1
        System.out.print("Enter the final number from a list of numbers to squareroot the even number: ");
        int num = scanner.nextInt();
        
       
        
        System.out.println("Number  SquareRoot");
        int count=0;
        for(int i=0; i <= num;i+=2){
           double squareRoot = Math.sqrt(i);
           System.out.printf("%d\t%.4f\n",i,squareRoot);
           count++;
        }
        System.out.println("There is a total of " + count + " even numbers above.");
        
        /*run:
Enter the final number from a list of numbers to squareroot the even number: 20
Number  SquareRoot
0	0.0000
2	1.4142
4	2.0000
6	2.4495
8	2.8284
10	3.1623
12	3.4641
14	3.7417
16	4.0000
18	4.2426
20	4.4721
There is a total of 11 even numbers above.
BUILD SUCCESSFUL (total time: 3 seconds)

       */
        
        
        
    }
    
}
