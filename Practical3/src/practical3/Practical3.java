/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical3;
import java.util.Scanner;
/**
 *
 * @author oscar
 */
public class Practical3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Q1

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of quiz scores to process: ");
        int totalScores = scanner.nextInt();

        int[] scores = new int[totalScores];
        int sum = 0;
        
        System.out.print("\n");
        for (int i = 0; i < totalScores; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
            sum += scores[i];
        }

        double average = (double) sum / totalScores;
        int aboveOrEqual = 0;
        int below = 0;

        for (int score : scores) {
            if (score >= average) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }

        System.out.println("\nResults\n=======");
        System.out.println("Average is " + average);
        System.out.println("Number of scores above or equal to the average is " + aboveOrEqual);
        System.out.println("Number of scores below the average is " + below);
    }
}

/*
Enter number of quiz scores to process: 5

Score 1: 10
Score 2: 8
Score 3: 9
Score 4: 2
Score 5: 4

Results
=======
Average is 6.6
Number of scores above or equal to the average is 3
Number of scores below the average is 2
BUILD SUCCESSFUL (total time: 19 seconds)

*/    
    

