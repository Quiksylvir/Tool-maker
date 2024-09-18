package edu.bsu.cs222;

public class ValueInput {
    public static void main(String[] args) {
        StudentAccolades userStudentAccolades = new StudentAccolades();
        userStudentAccolades.assignments = 7;
        userStudentAccolades.achievements = 6;
        userStudentAccolades.midTermReport = 3;
        userStudentAccolades.studentProjects.firstProjectCommandLine = 1;
        userStudentAccolades.studentProjects.firstProjectGUI = 1;
        userStudentAccolades.studentProjects.finalProjectIterationOne = 2;
        userStudentAccolades.studentProjects.finalProjectIterationTwo = 2;
        userStudentAccolades.studentProjects.finalProjectIterationThree = 3;
        userStudentAccolades.finalReport = 3;

        FinalGradePrinter.printFinalGrade(userStudentAccolades);

    }

}
