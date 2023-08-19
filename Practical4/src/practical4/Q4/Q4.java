/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical4.Q4;
import java.util.Scanner;
/**
 *
 * @author oscar
 */
public class Q4 {
    public static void main(String[] args) {
        CarType[] CarType ={new CarType("Toyata","Vios",1.5 ),new CarType("Nissan","Teana",2.0),new CarType("Honda","City",1.6)};
        
        Registeration[] register =new Registeration[6];
        
        Scanner sc= new Scanner(System.in);
        
        for(int i=0;i<register.length;i++){
            System.out.println("Registration No. : "+ Registeration.getNextRegNo());
            
            System.out.print("Enter name: ");
            String name =sc.nextLine();
            System.out.print("IC No: ");
            String ic =sc.next();
            
             System.out.print("Enter car plate no. : ");
            String carPlate =sc.next();
           System.out.print("Enter color : ");
            String color =sc.next();
              System.out.print("Enter year : ");
            int year =sc.nextInt();
            
            //menu of car tyoe
            for(int j=0;j< CarType.length;j++){
                System.out.println((j+1) + "." + CarType[j].toString());
            }
            System.out.print("Enter choice(1-3): ");
            int choice = sc.nextInt();
            
            Owner owner = new Owner(name,ic);
            Car car = new Car(carPlate,color,year,CarType[choice-1]);
            
            register[i]=new Registeration(owner,car);
            sc.nextLine();
        }
        
        System.out.printf("\n%50s\n","Car Registration Listing");  
        System.out.println("Reg No. Name    IC No.  Plate No. " +  "Color   Year    Make    Model   Capacity");
      
        
        for(int i=0;i<register.length;i++){
            System.out.println(register[i].toString());
    }
        
    }
}
/*
run:
Registration No. : 1001
Enter name: John Wayne
IC No: 111111111
Enter car plate no. : ABC123
Enter color : Blue
Enter year : 2010
1.Toyata     Vios       1.5
2.Nissan     Teana      2.0
3.Honda      City       1.6
Enter choice(1-3): 1
Registration No. : 1002
Enter name: Bea Arthur
IC No: 222222222
Enter car plate no. : WEA888
Enter color : Red
Enter year : 2010
1.Toyata     Vios       1.5
2.Nissan     Teana      2.0
3.Honda      City       1.6
Enter choice(1-3): 2
Registration No. : 1003
Enter name: Meg Ryan
IC No: 333333333
Enter car plate no. : PBL168
Enter color : Black
Enter year : 2011
1.Toyata     Vios       1.5
2.Nissan     Teana      2.0
3.Honda      City       1.6
Enter choice(1-3): 3
Registration No. : 1004
Enter name: Al Johnson
IC No: 555555555
Enter car plate no. : CAT118
Enter color : Green
Enter year : 2012
1.Toyata     Vios       1.5
2.Nissan     Teana      2.0
3.Honda      City       1.6
Enter choice(1-3): 1
Registration No. : 1005
Enter name: Jane Doe
IC No: 444444444
Enter car plate no. : BBB777
Enter color : White
Enter year : 2011
1.Toyata     Vios       1.5
2.Nissan     Teana      2.0
3.Honda      City       1.6
Enter choice(1-3): 2
Registration No. : 1006
Enter name: Ned Beatty
IC No: 666666666
Enter car plate no. : TV798
Enter color : Blue
Enter year : 2012
1.Toyata     Vios       1.5
2.Nissan     Teana      2.0
3.Honda      City       1.6
Enter choice(1-3): 1

                          Car Registration Listing
Reg No. Name    IC No.  Plate No. Color   Year    Make    Model   Capacity
1001   John Wayne      111111111  ABC123     Blue    2010  Toyata     Vios       1.5
1002   Bea Arthur      222222222  WEA888     Red     2010  Nissan     Teana      2.0
1003   Meg Ryan        333333333  PBL168     Black   2011  Honda      City       1.6
1004   Al Johnson      555555555  CAT118     Green   2012  Toyata     Vios       1.5
1005   Jane Doe        444444444  BBB777     White   2011  Nissan     Teana      2.0
1006   Ned Beatty      666666666  TV798      Blue    2012  Toyata     Vios       1.5
BUILD SUCCESSFUL (total time: 3 minutes 13 seconds)


*/
