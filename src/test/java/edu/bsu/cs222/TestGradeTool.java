package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGradeTool {
    @Test
    public void testGradeIsNotVoid() {
        GradeTool grader = new GradeTool();
        Boolean result = grader.failingGrade();
        Assertions.assertTrue(result);
    }
}
