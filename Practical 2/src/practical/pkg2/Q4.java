/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical.pkg2;

/**
 *
 * @author oscar
 */
public class Q4 {

    public static void main(String[] args) {
        double intAverage1 =  Average.calculateAverage(1, 2);
        double doubleAverage1 = Average.calculateAverage(1.6, 2.5);
        double intAverage2 =  Average.calculateAverage(1, 2, 3);
        double doubleAverage2 = Average.calculateAverage(1.3, 2.5, 3.5);

        System.out.println("Integer average (2 parameters): " + intAverage1);
        System.out.println("Double average (2 parameters): " + doubleAverage1);
        System.out.println("Integer average (3 parameters): " + intAverage2);
        System.out.println("Double average (3 parameters): " + doubleAverage2);
    }
}


/*
run:
Integer average (2 parameters): 5
Double average (2 parameters): 5.65
Integer average (3 parameters): 2
Double average (3 parameters): 2.5
BUILD SUCCESSFUL (total time: 0 seconds)

*/