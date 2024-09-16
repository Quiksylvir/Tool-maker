package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestConvertSpecsToLetter {
    @Test
    public void testAssignmentsToLetterGradeA() {
        SpecsConverter convert = new SpecsConverter();
        StudentAccolades student = new StudentAccolades(7);
        int result = convert.convertToGradeScale(student);
        Assertions.assertEquals(result,4);

    }
}
