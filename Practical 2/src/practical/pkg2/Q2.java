/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical.pkg2;

/**
 *
 * @author oscar
 */
public class Q2 {
    public class SquareRootApproximation {
    public static void main(String[] args) {
        double number = 25.0; // The number for which to calculate the square root
        double precision = 1e-8; // The desired precision

        double result = sqrt(number, precision);

        System.out.printf("Square root of %.2f is approximately %.8f%n", number, result);
    }

    public static double sqrt(double number, double precision) {
        if (number < 0) {
            System.out.println("Cannot calculate square root of a negative number.");
            System.exit(1);
        }

        if (number == 0 || number == 1) {
            return number;
        }

        double lowerLimit;
        double upperLimit;

        if (number > 1) {
            lowerLimit = 1;
            upperLimit = number;
        } else {
            lowerLimit = number;
            upperLimit = 1;
        }

        double midpoint = (lowerLimit + upperLimit) / 2;
        double square = midpoint * midpoint;

        while (Math.abs(square - number) > precision) {
            if (square > number) {
                upperLimit = midpoint;
            } else {
                lowerLimit = midpoint;
            }

            midpoint = (lowerLimit + upperLimit) / 2;
            square = midpoint * midpoint;
        }

        return midpoint;
    }
}
    
}
/*run:
Square root of 25.00 is approximately 5.00000000
BUILD SUCCESSFUL (total time: 0 seconds)
*/
