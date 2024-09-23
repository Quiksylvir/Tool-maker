package edu.bsu.cs222;

public class StudentIndividualAssignments {
    protected int assignments;
    protected int achievements;
    protected int midTermReport;
    protected int finalReport;

    public StudentIndividualAssignments
            (int assignments, int achievements, int midTermReport, int finalReport)
    {
        this.assignments = assignments;
        this.achievements = achievements;
        this.midTermReport = midTermReport;
        this.finalReport = finalReport;
    }


    public StudentIndividualAssignments(){}
}
