package edu.bsu.cs222;

public class GradeTool {

    protected char gradeAccolades(StudentAccolades student) {
        gradeIndividualAssignments(student.studentIndividualAssignments);
        gradeProjects(student.studentProjects);

        return LetterGradeHandler.finalLetterGrade;
    }

    protected void gradeIndividualAssignments(StudentIndividualAssignments studentIndividualAssignments){
        LetterGradeHandler.updateFinalLetterGrade(gradeAssignments(studentIndividualAssignments));
        LetterGradeHandler.updateFinalLetterGrade(gradeAchievements(studentIndividualAssignments));
        LetterGradeHandler.updateFinalLetterGrade(gradeMidtermReport(studentIndividualAssignments));
        LetterGradeHandler.updateFinalLetterGrade(gradeFinalReport(studentIndividualAssignments));
    }
    protected char gradeAssignments(StudentIndividualAssignments studentAssignments) {
        return LetterGradeHandler.convertToLetterGrade(studentAssignments.assignments-=4);
    }

    protected char gradeAchievements(StudentIndividualAssignments studentAchievements) {
        return LetterGradeHandler.convertToLetterGrade(studentAchievements.achievements-=3);
    }

    protected char gradeMidtermReport(StudentIndividualAssignments studentMidterm) {
        if (LetterGradeHandler.convertToLetterGrade(studentMidterm.midTermReport) == 'A') {
            return 'A';
        } else {
            return 'D';
        }
    }

    protected char gradeFinalReport(StudentIndividualAssignments studentFinal) {
        return LetterGradeHandler.convertToLetterGrade(studentFinal.finalReport);
    }

    protected void gradeProjects(StudentProjects studentProjects){
        LetterGradeHandler.updateFinalLetterGrade(gradeBeginnerProjects(studentProjects));
        LetterGradeHandler.updateFinalLetterGrade(gradeLastIteration(studentProjects));
    }


    protected char gradeBeginnerProjects(StudentProjects studentProjects) {
        int gradeNumber = studentProjects.firstProjectCommandLine;
        if (gradeNumber > studentProjects.firstProjectGUI) {
            gradeNumber = studentProjects.firstProjectGUI;
        }
        if (gradeNumber > studentProjects.finalProjectIterationOne) {
            gradeNumber = studentProjects.finalProjectIterationOne;
        }
        if (gradeNumber > studentProjects.finalProjectIterationTwo) {
            gradeNumber = studentProjects.finalProjectIterationTwo;
        }
        return LetterGradeHandler.convertToLetterGrade(gradeNumber+2);
    }

    protected char gradeLastIteration(StudentProjects studentProjects) {
        if (LetterGradeHandler.convertToLetterGrade(studentProjects.finalProjectIterationThree) == 'D') {
            return 'C';
        }else {
            return LetterGradeHandler.convertToLetterGrade(studentProjects.finalProjectIterationThree);
        }
    }
}
