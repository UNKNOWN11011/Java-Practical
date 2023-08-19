/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical.pkg2;
/**
 *
 * @author oscar
 */
public class Q3 {


    public static void main(String[] args) {
        System.out.println("Inches\tCentimeters\tCentimeters\tInches");
        
        
        for (double i = 1; i <= 10; i += 1) {
            double centimeters = UnitConverter.inchToCentimeter(i);
           double cmTimes5 = i*5;
           double inches = UnitConverter.centimeterToInch(cmTimes5);
            System.out.printf("%.1f\t%.2f\t\t%.1f\t\t%.2f%n", i, centimeters,cmTimes5, inches);
        }
        
       
    }
}


/*run:
Inches	Centimeters	Centimeters	Inches
1.0	2.54		5.0		1.97
2.0	5.08		10.0		3.94
3.0	7.62		15.0		5.91
4.0	10.16		20.0		7.87
5.0	12.70		25.0		9.84
6.0	15.24		30.0		11.81
7.0	17.78		35.0		13.78
8.0	20.32		40.0		15.75
9.0	22.86		45.0		17.72
10.0	25.40		50.0		19.69
BUILD SUCCESSFUL (total time: 0 seconds)
*/