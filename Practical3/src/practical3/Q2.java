/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical3;

/**
 *
 * @author oscar
 */
public class Q2 {
    
    public static int findSmallestIndex(int[] numbers) {

        int smallest = numbers[0];
        int smallestIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

        public static void main(String[] args) {
        int[] list = {1, 2, 4, 5, 10, 100, 2, -22};
        int smallestIndex = findSmallestIndex(list);
        System.out.println("Index of the smallest element: " + smallestIndex);
    }
        
}
/*
run:
Index of the smallest element: 7
BUILD SUCCESSFUL (total time: 0 seconds)

*/

