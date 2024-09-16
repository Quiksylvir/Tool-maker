package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGradeTool {
    @Test
    public void testGradeIsLetterGradeA() {
        StudentAccolades student = new StudentAccolades(3,3,3, new StudentProjects(3,3,3,3,3), 3);
        GradeTool grader = new GradeTool();
        char result = grader.finalGrade(student);
        Assertions.assertEquals(result, 'A');
    }
    @Test
    public void testFirstProjectsIsLetterGradeA() {
        StudentAccolades student = new StudentAccolades(3,3,3, new StudentProjects(3,3,3,3,3), 3);
        GradeTool grader = new GradeTool();
        char result = grader.gradeBeginnerProjects(student.studentProjects);
        Assertions.assertEquals(result, 'A');
    }
    @Test
    public void testConvertBeginnerProjectsNumberToLetter() {
        StudentAccolades student = new StudentAccolades(3,3,3, new StudentProjects(3,3,3,3,3), 3);
        GradeTool grader = new GradeTool();
        char result = grader.convertBeginnerProjectsToLetterGrade(1);
        Assertions.assertEquals(result, 'A');
    }
}
