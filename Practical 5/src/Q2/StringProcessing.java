/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;
import java.util.Scanner;
/**
 *
 * @author oscar
 */
public class StringProcessing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String modifiedString = modifyString(input);
        System.out.println("Modified string: " + modifiedString);
    }
    
    public static String modifyString(String str) {
        str = str.toUpperCase();
        str = str.replaceAll("[AEIOU]", "x");
        return str;
    }
}

