/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;
import java.util.Scanner;
/**
 *
 * @author oscar
 */


public class StringProcessing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        
        if (isValidPassword(password)) {
            System.out.println("\"Valid Password\"");
        } else {
            System.out.println("\"Invalid Password\"");
        }
    }
    
    public static boolean isValidPassword(String password) {
        if (password.length() < 7) {
            return false;
        }
        
        boolean hasLetter = false;
        boolean hasDigit = false;
        
        for (char ch : password.toCharArray()) {
            if (Character.isLetter(ch)) {
                hasLetter = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            
            if (hasLetter && hasDigit) {
                return true;
            }
        }
        
        return false;
    }
}
