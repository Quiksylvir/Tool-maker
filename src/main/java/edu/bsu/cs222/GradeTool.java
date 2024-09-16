package edu.bsu.cs222;

public class GradeTool {
    public char finalGrade(StudentAccolades student) {
        char projectLetterGrade = gradeProjects(student);
        return 'A';
    }

    protected char gradeProjects(StudentAccolades student) {
        gradeBeginnerProjects(student.studentProjects);
        //gradeLastIteration(student.studentProjects);
        return 'A';
    }

//    protected char gradeLastIteration(StudentProjects studentProjects) {
//    }

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
        return convertBeginnerProjectsToLetterGrade(gradeNumber);
    }


    public char convertBeginnerProjectsToLetterGrade(int gradeNumber) {
        if(gradeNumber >= 1) {
            return 'A';
        }else {
            return 'D';
        }
    }
}
