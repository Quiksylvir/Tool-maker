package edu.bsu.cs222;

public class ValueInput {
    public static void main(String[] args) {
        StudentAccolades userStudentAccolades = new StudentAccolades();
        userStudentAccolades.studentIndividualAssignments.assignments = 7;
        userStudentAccolades.studentIndividualAssignments.achievements = 6;
        userStudentAccolades.studentIndividualAssignments.midTermReport = 3;
        userStudentAccolades.studentProjects.firstProjectCommandLine = 3;
        userStudentAccolades.studentProjects.firstProjectGUI = 3;
        userStudentAccolades.studentProjects.finalProjectIterationOne = 3;
        userStudentAccolades.studentProjects.finalProjectIterationTwo = 3;
        userStudentAccolades.studentProjects.finalProjectIterationThree = 3;
        userStudentAccolades.studentIndividualAssignments.finalReport = 3;

        FinalGradePrinter.printFinalGrade(userStudentAccolades);

    }

}
