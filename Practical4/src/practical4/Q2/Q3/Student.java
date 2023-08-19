/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical4.Q2.Q3;

/**
 *
 * @author oscar
 */
public class Student {
     private String studentID;
    private String name;
    private int numOfQuizzes;
    private int totalQuizScore;


    public Student() {
        // No-arg constructor
    }

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    //getter
    public String getStudentID() {
        return studentID;
    }
    
    public String getName() {
        return name;
    }

    public int getNumOfQuizzes() {
        return numOfQuizzes;
    }

//    public int getTotalQuizScore() {
//        return totalQuizScore;
//    }

    public int getTotalScore() {
        return totalQuizScore;
    }

    public double getAverageScore() {
        if (numOfQuizzes == 0) {
            return 0.0;
        }
        return (double) totalQuizScore / numOfQuizzes;
    }
    
    //setter
     public void setName(String name) {
        this.name = name;
    }

     
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    
       public void addQuiz(int score) {
        numOfQuizzes++;
        totalQuizScore += score;
    }
       
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentID("1001");
        student1.setName("John Wayne");
        student1.addQuiz(8);
        student1.addQuiz(7);

        Student student2 = new Student("1002", "Bea Arthur");
        student2.addQuiz(9);
        student2.addQuiz(10);

        System.out.println("Student 1 ID: " + student1.getStudentID());
        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 Total Score: " + student1.getTotalScore());
        System.out.println("Student 1 Average Score: " + student1.getAverageScore());

        System.out.println("Student 2 ID: " + student2.getStudentID());
        System.out.println("Student 2 Name: " + student2.getName());
        System.out.println("Student 2 Total Score: " + student2.getTotalScore());
        System.out.println("Student 2 Average Score: " + student2.getAverageScore());
    }
}


