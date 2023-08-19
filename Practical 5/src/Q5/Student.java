/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author oscar
 */
public class Student {

    private String studentID;
    private String name;
    private String school;
    
    //setter/mutator
    public Student(String studentID, String name, String school) {
        this.studentID = studentID;
        this.name = name;
        this.school = school;
    }

    //getter/accessor
    public boolean validateStudentID(Student student) {
        // Check if studentID has correct format
        if (student.studentID.length() != 6) {
            return false;
        }
        char schoolCode = student.studentID.charAt(0);

        // Check if the school code is valid
        if (schoolCode == 'A' || schoolCode == 'B') {
            // Check if the remaining characters are digits
            for (int i = 1; i < student.studentID.length(); i++) {
                if (!Character.isDigit(student.studentID.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Student student1 = new Student("C12345", "John", "FASC");
        Student student2 = new Student("B88888", "Jane", "FAFB");
        
        if (student1.validateStudentID(student1)) {
            System.out.println(student1.studentID + " is a valid student ID.");
        } else {
            System.out.println(student1.studentID + " is not a valid student ID.");
        }

        if (student2.validateStudentID(student2)) {
            System.out.println(student2.studentID + " is a valid student ID.");
        } else {
            System.out.println(student2.studentID + " is not a valid student ID.");
        }
    }
}


