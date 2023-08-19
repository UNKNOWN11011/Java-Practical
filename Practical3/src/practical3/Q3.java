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
public class Q3 {

public class BanknoteBreakdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the quantity of each denomination:");
        int[] denominations = {100,50,20,10,5,1}; // Assuming denominations in ascending order
        int totalValue = 0;

        for (int i = 0; i < denominations.length; i++) {
            System.out.print("Denomination " + denominations[i] + ": ");
            int quantity = scanner.nextInt();
            totalValue += denominations[i] * quantity;
        }

        
        System.out.println("\nBreakdown of Banknotes:");
        for (int i = 0; i < denominations.length; i++) {
            int quantity = (totalValue / denominations[i]);
            if (quantity > 0) {
                System.out.println(denominations[i] + " x " + quantity);
                totalValue %= denominations[i];
            }
        }

        System.out.println("\nTotal Value = RM" + totalValue);
    }
}

}
