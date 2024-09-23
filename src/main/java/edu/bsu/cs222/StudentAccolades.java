package edu.bsu.cs222;

public class StudentAccolades {

    protected StudentProjects studentProjects;
    protected StudentIndividualAssignments studentIndividualAssignments;

        public StudentAccolades
                (StudentIndividualAssignments studentIndividualAssignments,
                 StudentProjects studentProjects)
            {
                this.studentIndividualAssignments = studentIndividualAssignments;
                this.studentProjects = studentProjects;

            }


        public StudentAccolades(){
            studentProjects = new StudentProjects();
            studentIndividualAssignments = new StudentIndividualAssignments();
        }
}
