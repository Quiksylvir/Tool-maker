package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGradeTool {
    @Test
    public void testGradeIsNotFailing() {
        GradeTool grader = new GradeTool();
        char result = grader.finalGrade('D');
        Assertions.assertEquals(result, 'D');
    }
}
