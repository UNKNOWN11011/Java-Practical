/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TeacherAnswers;
import java.util.Scanner;
/**
 *
 * @author oscar
 */
public class checkPassword {
     public static void main(String[] args) {
  	Scanner scanner = new Scanner(System.in);
  	System.out.print("Enter a password: ");
  	String password = scanner.nextLine();
  	password = password.trim();
  	boolean valid = true;
  	
  	if (password.length() < 7)
  		valid = false;
  	else {
  		int countLetters = 0;
  		int countDigits = 0;
  		for (int i = 0; i < password.length() && valid; ++i) {
  			char ch = password.charAt(i);
  			if (Character.isLetter(ch))
  				countLetters++;
  			else if (Character.isDigit(ch))
  				countDigits++;
  			else
  				valid = false;
  		}
  		
  		if (countLetters == 0 || countDigits == 0) {
  			valid = false;
  		}
  	}
  	
  	if (valid)
  		System.out.println("Valid Password");
  	else
  		System.out.println("Invalid Password");
  }
}

