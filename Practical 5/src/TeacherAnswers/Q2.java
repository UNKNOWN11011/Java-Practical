/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TeacherAnswers;

/**
 *
 * @author oscar
 */
public class Q2 {
    
    public static void main(String[] args) {
    	Student s = new Student("A33445", "John Lim", "FASC");
        System.out.println(Student.validateStudentID(s));
        System.out.println(s.name + " is studying in " + s.school);
    }
}

class Student{
	 String studentID;
	 String name;
	 String school;

   public Student(String studentID, String name, String school){
   	  this.studentID = studentID;
   	  this.name = name;
   	  this.school = school;
   }
   public static boolean validateStudentID(Student s ) {
	String id = s.studentID;
  	char schoolCode = Character.toUpperCase(id.charAt(0));
  	String regNo = id.substring(1, id.length());
  	if (!Character.isLetter(schoolCode) || regNo.length() != 5) 
  		return false;
  	else {
  		for (int i = 0; i < regNo.length(); ++i) {
  			if (!Character.isDigit(regNo.charAt(i)))
  				return false;
  		}
  	}	
  	boolean valid = true;
  	switch(schoolCode) {
  		case 'A': valid = s.school.equals("FASC");
  				break;
  		case 'B':	valid = s.school.equals("FAFB");
  					break;
  	}
  	return valid;
  }
}
