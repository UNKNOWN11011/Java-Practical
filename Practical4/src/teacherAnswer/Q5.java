/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacherAnswer;

/**
 *
 * @author oscar
 */
public class Q5 {
    public static void main(String[] args) {
        Course course = new Course("Introduction to Computers",250);
        course.addStudent("Ali Said");
         course.addStudent("Wong Ken");
          course.addStudent("Peter Lim");

          System.out.println(course.toString());
          System.out.println("The total fees collected: RM "+
                  course.calcFeeCollected());

          System.out.println("List of Students in "+ course.getCourseTitle());
          for(int i=0;i< course.getNoOfStudent();i++) {
              System.out.println((i+1)+". "+course.getStudentNames()[i]);
              
          }



    }
}
