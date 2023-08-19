/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical.pkg2;

/**
 *
 * @author oscar
 */
public class teacherAnswers {
    //Q1
//     public static void main(String[] args) {
//    System.out.println("Number \t SquareRoot");
//    
//    for(int i =0;i <=20;i+=2){
//         System.out.printf("%d \t %.4f\n",i,Math.sqrt(i));
//         }

    /*
    run:
Number 	 SquareRoot
0 	 0.0000
2 	 1.4142
4 	 2.0000
6 	 2.4495
8 	 2.8284
10 	 3.1623
12 	 3.4641
14 	 3.7417
16 	 4.0000
18 	 4.2426
20 	 4.4721
BUILD SUCCESSFUL (total time: 0 seconds)

    */
    
    //Q2
 
    public static void main(String[] args){
        System.out.println("Number \t SquareRoot");
        for (int i = 0; i <= 20; i++)
        {
            System.out.printf("%d \t %f\n", i, sqrt(i));
        }
    }
    
    public static double sqrt(int n){
        double l = 0;
        double u = 0;
        double mid;
        double mid2;
        
        if(n < 0)
        {
            System.out.println("The number cannot be negative number");
            System.exit(1); // 1 or -1 also can
        }
        
        if(n == 0)
        {
            return 0;
        }
        
        if(n == 1)
        {
            return 1;
        }
        
        if(n > 1)
        {
            l = 1;
            u = n;
        }
        else if(n < 1)
        {
            l = n;
            u = 1;
        }
        
        while(Math.abs(u - l)/l >= 1e-8)
        {
            mid = (u + l) / 2;
            mid2 = mid * mid;
            
            if(mid2 > n)
            {
                u = mid;
            }
            else
            {
                l = mid;
            }
        }
        
        return (u + l) / 2;
    
}
    
    
}



