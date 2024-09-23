package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGradeTool {
    @Test
    public void testGradeAccoladesIsLetterGradeA(){
        StudentAccolades student = new StudentAccolades
                (new StudentIndividualAssignments(7,6,3,3),
                new StudentProjects(3,3,3,3,3));
        GradeTool grader = new GradeTool();
        char result = grader.gradeAccolades(student);
        Assertions.assertEquals(result, 'A');
    }
    @Test
    public void testGradeAccoladesIsLetterGradeC(){
        StudentAccolades student = new StudentAccolades
                (new StudentIndividualAssignments(5,5,3,3),
                        new StudentProjects(3,3,3,3,3));
        GradeTool grader = new GradeTool();
        char result = grader.gradeAccolades(student);
        Assertions.assertEquals(result, 'C');
    }
    @Test
    public void testAssignmentsIsLetterGradeA(){
        StudentIndividualAssignments student = new StudentIndividualAssignments(7,3,3,3);
        GradeTool grader = new GradeTool();
        char result = grader.gradeAssignments(student);
        Assertions.assertEquals(result, 'A');
    }
    @Test
    public void testAchievementsIsLetterGradeA(){
        StudentIndividualAssignments student = new StudentIndividualAssignments(3,6,3,3);
        GradeTool grader = new GradeTool();
        char result = grader.gradeAchievements(student);
        Assertions.assertEquals(result, 'A');
    }
    @Test
    public void testMidtermReportIsLetterGradeA(){
        StudentIndividualAssignments student = new StudentIndividualAssignments(3,3,3,3);
        GradeTool grader = new GradeTool();
        char result = grader.gradeMidtermReport(student);
        Assertions.assertEquals(result, 'A');
    }
    @Test
    public void testFirstProjectsIsLetterGradeA() {
        StudentProjects student = new StudentProjects(3,3,3,1,3);
        GradeTool grader = new GradeTool();
        char result = grader.gradeBeginnerProjects(student);
        Assertions.assertEquals(result, 'A');
    }
    @Test
    public void testFinalIterationIsLetterGradeA() {
        StudentProjects student = new StudentProjects(3,3,3,3,3);
        GradeTool grader = new GradeTool();
        char result = grader.gradeLastIteration(student);
        Assertions.assertEquals(result, 'A');
    }
    @Test
    public void testFinalReportIsLetterGradeA(){
        StudentIndividualAssignments student = new StudentIndividualAssignments(3,3,3,3);
        GradeTool grader = new GradeTool();
        char result = grader.gradeFinalReport(student);
        Assertions.assertEquals(result, 'A');
    }
}
