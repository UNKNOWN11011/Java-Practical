/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacherAnswer;

/**
 *
 * @author oscar
 */
public class Course {
    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudent;
    private String[] studentNames= new String[100];
    private static int courseCount;
    
    public Course(String courseTitle, double feesPerStudent){
        this.courseTitle= courseTitle;
        this.feesPerStudent=feesPerStudent;
        noOfStudent =0;
        courseCount++;
    }
    
    //Getter/Acessor
    public String getCourseTitle(){
       return courseTitle;
    }
    
       public double getFeesPerStudent(){
       return feesPerStudent;
    }
       
              public int getNoOfStudent(){
       return noOfStudent;      
    }
           
                public String[] getStudentNames(){
       return studentNames;      
    }   
              public int getCourseCount(){
       return courseCount;      
    }   
              
    //setter/mutator
             public void setCourseTitle(String courseTitle){
       this.courseTitle=courseTitle;
    }
    
       public void setFeesPerStudent(double feesPerStudent){
       this.feesPerStudent=feesPerStudent;
    }
       
       public double calcFeeCollected(){
           return feesPerStudent * noOfStudent;
       }
 
        public void addStudent(String studName){
         studentNames[noOfStudent]=studName;
         noOfStudent++;
       }
        
        public String toString(){
            return String.format("Course Title: %s \n"
            + "Fees per Student: %.2f \n"
            + "No. of student: %d \n"
                    , courseTitle,feesPerStudent,noOfStudent);
        }
       
}
