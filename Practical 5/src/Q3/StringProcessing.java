/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class StringProcessing {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name that you want to wish: ");
        String inputName = scanner.nextLine();
        
        if (inputName.length() == 0) {
            System.out.println("Please provide a person's name as a command line argument.");
            return;
        }
        
      
        String correctedName = correctName(inputName);
        
        System.out.println("To: " + correctedName);
        System.out.println("Wishing you a Merry Christmas, " + getLastName(correctedName) + ".");
    }
    
    public static String correctName(String name) {
        String[] nameParts = name.toLowerCase().split(" ");
        StringBuilder correctedName = new StringBuilder();
        
        for (String part : nameParts) {
            correctedName.append(Character.toUpperCase(part.charAt(0)))
                         .append(part.substring(1))
                         .append(" ");
        }
        
        return correctedName.toString().trim();
    }
    
    public static String getLastName(String fullName) {
        String[] nameParts = fullName.split(" ");
        return nameParts[nameParts.length - 3];
    }
    
//
//    public static void main(String[] args) {
//        
//           Scanner scanner = new Scanner(System.in);
//        
//        System.out.print("C:\\java Q5 ");
//        String inputName = scanner.nextLine();
//        
//
//        if (inputName.length() == 0) {
//            System.out.println("Please provide a person's name as a command line argument.");
//            return;
//        }
//
//       
//        String correctedName = correctName(inputName);
//
//        System.out.println("To: " + correctedName);
//        System.out.println("Wishing you a Merry Christmas, " + getLastName(correctedName) + ".");
//    }
//
//    public static String correctName(String name) {
//        String[] nameParts = name.toLowerCase().split(" ");
//        StringBuilder correctedName = new StringBuilder();
//
//        for (String part : nameParts) {
//            correctedName.append(Character.toUpperCase(part.charAt(0)))
//                         .append(part.substring(1))
//                         .append(" ");
//        }
//
//        return correctedName.toString().trim();
//    }
//
//    public static String getLastName(String fullName) {
//        int openBracketIndex = fullName.indexOf('[');
//        int closeBracketIndex = fullName.indexOf(']');
//
//        if (openBracketIndex != -1 && closeBracketIndex != -1 && closeBracketIndex > openBracketIndex) {
//            return fullName.substring(openBracketIndex + 1, closeBracketIndex);
//        }
//
//        return fullName.split(" ")[fullName.split(" ").length - 1];
//    }
}



