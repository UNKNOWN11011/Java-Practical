/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1;
import java.util.Scanner;
/**
 *
 * @author oscar
 */
public class StringProcessing {

    public static int countLetter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        System.out.print("Enter the letter you want to count: ");
        char letter = scanner.next().charAt(0);
        
        int letterCount = countLetter(word, letter);
        System.out.println(word + " contains " + letterCount +" "+ letter);
    }
}

    

