package edu.bsu.cs222;

public class GradeTool {
    private char finalLetterGrade;
    GradeTool(){
        finalLetterGrade = 'A';
    }

    protected char gradeAccolades(StudentAccolades student) {
        updateFinalLetterGrade(gradeAssignments(student));
        updateFinalLetterGrade(gradeAchievements(student));
        updateFinalLetterGrade(gradeMidtermReport(student));
        updateFinalLetterGrade(gradeBeginnerProjects(student.studentProjects));
        updateFinalLetterGrade(gradeLastIteration(student.studentProjects));
        updateFinalLetterGrade(gradeFinalReport(student));
        return finalLetterGrade;
    }
    public char gradeAssignments(StudentAccolades studentProjects) {
        return convertToLetterGrade(studentProjects.assignments-=4);
    }

    public char gradeAchievements(StudentAccolades studentProjects) {
        return convertToLetterGrade(studentProjects.achievements-=3);
    }

    public char gradeMidtermReport(StudentAccolades studentProjects) {
        if (convertToLetterGrade(studentProjects.midTermReport) == 'A') {
            return 'A';
        } else {
            return 'D';
        }

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
        return convertToLetterGrade(gradeNumber+2);
    }


    protected char gradeLastIteration(StudentProjects studentProjects) {
        if (convertToLetterGrade(studentProjects.finalProjectIterationThree) == 'D') {
            return 'C';
        }else {
            return convertToLetterGrade(studentProjects.finalProjectIterationThree);
        }
    }


    public char gradeFinalReport(StudentAccolades studentProjects) {
        return convertToLetterGrade(studentProjects.finalReport);
    }

    private char convertToLetterGrade(int accolade) {
        if (accolade >= 3) {
            return 'A';
        } else if (accolade == 2) {
            return 'B';
        } else if (accolade == 1) {
            return 'C';
        } else if (accolade == 0) {
            return 'D';
        } else {
            return 'F';
        }
    }
    private void updateFinalLetterGrade(char letterGrade) {
        if(letterGrade > finalLetterGrade) {
            finalLetterGrade = letterGrade;
        }
    }


}
