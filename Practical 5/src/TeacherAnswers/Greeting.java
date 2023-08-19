/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TeacherAnswers;

/**
 *
 * @author oscar
 */
public class Greeting {
       public static void    main (String[] args) {
		String title, fname="c: java [Pang] Jun Meng Mr ";	
		
		// Decode the parameters
	
		if (args.length < 2) {
		    System.out.println ("Usage: java greeting <name> <title.");
		    System.exit (1);
		}
		
		title = args[args.length -1];
		for (int i = 0; i< args.length - 1; i++){
			 String name = args[i].toLowerCase();
			 if (name.charAt(0)=='[')
			 	 name = name.replace(name.charAt(1), Character.toUpperCase(name.charAt(1)));
			 else
			 	name = name.replace(name.charAt(0), Character.toUpperCase(name.charAt(0)));
		   	 fname +=" "+ name;
    	}
	   	 // retrieve surname
		int startSN = fname.indexOf('[');
		int endSN = fname.indexOf(']');
		String surname = fname.substring(startSN +1, endSN);
		
		
		fname = fname.replace("]","");
		fname = fname.replace("[","");
	
		System.out.println ("To: " + fname);
		System.out.println("Wishing you a Merry Christmas,"+ title + " "+ surname);    
    }
}
