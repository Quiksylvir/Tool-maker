package edu.bsu.cs222;

public class LetterGradeHandler {

    protected static char finalLetterGrade;

    public LetterGradeHandler() {
        finalLetterGrade = 'A';
    }

    protected static char convertToLetterGrade(int accolade) {
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

    public static void updateFinalLetterGrade(char letterGrade) {
        if(letterGrade > finalLetterGrade) {
            finalLetterGrade = letterGrade;
        }
    }
}
