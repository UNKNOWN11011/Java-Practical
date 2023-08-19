/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical4.Q2.Q3;

/**
 *
 * @author oscar
 */
public class Students {

    
    private String studentID;
    private String name;
    private int numOfQuizzes;
    private int totalQuizScore;
    private static double quizContribution = 0.2;

      public Students() {
        this("","");
    }

    public Students(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

     public Students(String name) {
        this("", name);
    }

    public Students(int score) {
        numOfQuizzes++;
        totalQuizScore += score;
    }
    //getter/accessor
    public String getStudentID() {
        return studentID;
    }

      public String getName() {
        return name;
    }
      
      public int getNumOfQuizzes() {
        return numOfQuizzes;
    }

    public int getTotalQuizScore() {
        return totalQuizScore;
    }


    public double getAverageScore() {
        if (numOfQuizzes == 0) {
            return 0.0;
        }
        double averageQuizScore= totalQuizScore/numOfQuizzes;
        return (averageQuizScore/10) * 100;
    }
    
    public static double getQuizContribution() {
        return quizContribution;
    }
    
    //setter/mutator
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setQuizContribution(double contribution) {
        quizContribution = contribution;
    }
    
   
    public void addQuiz(int score) {
        numOfQuizzes++;
        totalQuizScore += score;
    }
    
    
    public double totalquizContribution() {
        return (quizContribution * (totalQuizScore/2)/10 )*100;
    }

    public static void main(String[] args) {
        Students student1 = new Students("John Wayne");
        student1.addQuiz(20);
        student1.addQuiz(20);

        Students student2 = new Students("Bea Arthur");
        student2.addQuiz(20);
        student2.addQuiz(11);

        System.out.println("Quiz Contribution: " + Students.getQuizContribution()*100 + "%");

        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 Total Quiz Score: " + student1.getTotalQuizScore());
        System.out.println("Student 1 Total Quiz Score Contribution: " + student1.totalquizContribution());

        System.out.println("Student 2 Name: " + student2.getName());
        System.out.println("Student 2 Total Quiz Score: " + student2.getTotalQuizScore());
        System.out.printf("Student 2 Total Quiz Score Contribution: %.1f\n" ,student2.totalquizContribution());
    }

    }



/*
run:
Quiz Contribution: 20.0%
Student 1 Name: John Wayne
Student 1 Total Quiz Score: 40
Student 1 Total Quiz Score Contribution: 40.0
Student 2 Name: Bea Arthur
Student 2 Total Quiz Score: 31
Student 2 Total Quiz Score Contribution: 30.0
BUILD SUCCESSFUL (total time: 0 seconds)
*/

