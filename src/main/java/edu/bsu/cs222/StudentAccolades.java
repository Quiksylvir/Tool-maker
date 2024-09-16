package edu.bsu.cs222;

public class StudentAccolades {
    protected int assignments;
    protected int achievements;
    protected int midTermReport;
    protected StudentProjects studentProjects;
    protected int finalReport;

        public StudentAccolades(
               int assignments,
               int achievements,
               int midTermReport,
               StudentProjects studentProjects,
               int finalReport
              ) {
                    this.assignments = assignments;
                    this.achievements = achievements;
                    this.midTermReport = midTermReport;
                    this.studentProjects = studentProjects;
                    this.finalReport = finalReport;
              }
}
