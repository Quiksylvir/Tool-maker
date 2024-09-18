package edu.bsu.cs222;

public class FinalGradePrinter {

    public static void printFinalGrade(StudentAccolades userStudentAccolades){
        GradeTool grader = new GradeTool();
        System.out.printf("Final Grade: %s", grader.gradeAccolades(userStudentAccolades));
    }
}
