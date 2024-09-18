package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGradeTool {
    @Test
    public void testGradeAccoladesIsLetterGradeA(){
        StudentAccolades student = new StudentAccolades(7,6,3, new StudentProjects(3,3,3,3,3), 3);
        GradeTool grader = new GradeTool();
        char result = grader.gradeAccolades(student);
        Assertions.assertEquals(result, 'A');
    }
    @Test
    public void testGradeAccoladesIsLetterGradeC(){
        StudentAccolades student = new StudentAccolades(5,6,3, new StudentProjects(3,3,3,3,3), 3);
        GradeTool grader = new GradeTool();
        char result = grader.gradeAssignments(student);
        Assertions.assertEquals(result, 'C');
    }
    @Test
    public void testAssignmentsIsLetterGradeA(){
        StudentAccolades student = new StudentAccolades(7,3,3, new StudentProjects(3,3,3,3,3), 3);
        GradeTool grader = new GradeTool();
        char result = grader.gradeAssignments(student);
        Assertions.assertEquals(result, 'A');
    }
    @Test
    public void testAchievementsIsLetterGradeA(){
        StudentAccolades student = new StudentAccolades(3,6,3, new StudentProjects(3,3,3,3,3), 3);
        GradeTool grader = new GradeTool();
        char result = grader.gradeAchievements(student);
        Assertions.assertEquals(result, 'A');
    }
    @Test
    public void testMidtermReportIsLetterGradeA(){
        StudentAccolades student = new StudentAccolades(3,3,3, new StudentProjects(3,3,3,3,3), 3);
        GradeTool grader = new GradeTool();
        char result = grader.gradeMidtermReport(student);
        Assertions.assertEquals(result, 'A');
    }
    @Test
    public void testFirstProjectsIsLetterGradeA() {
        StudentAccolades student = new StudentAccolades(3,3,3, new StudentProjects(1,1,1,1,3), 3);
        GradeTool grader = new GradeTool();
        char result = grader.gradeBeginnerProjects(student.studentProjects);
        Assertions.assertEquals(result, 'A');
    }
    @Test
    public void testFinalIterationIsLetterGradeA() {
        StudentAccolades student = new StudentAccolades(3,3,3, new StudentProjects(3,3,3,3,3), 3);
        GradeTool grader = new GradeTool();
        char result = grader.gradeLastIteration(student.studentProjects);
        Assertions.assertEquals(result, 'A');
    }
    @Test
    public void testFinalReportIsLetterGradeA(){
        StudentAccolades student = new StudentAccolades(3,3,3, new StudentProjects(3,3,3,3,3), 3);
        GradeTool grader = new GradeTool();
        char result = grader.gradeFinalReport(student);
        Assertions.assertEquals(result, 'A');
    }
}
