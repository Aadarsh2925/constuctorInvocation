package academy.learnprogramming;

public class postGradStudent extends Student{
    private int postCourseId;
    private String postCourseName;
    private double postCourseFees;

    public postGradStudent(int studentId, char studentType, String studentName, int postCourseId, String postCourseName, double postCourseFees) {
        super(studentId, studentType, studentName);
        this.postCourseId = postCourseId;
        this.postCourseName = postCourseName;
        this.postCourseFees = postCourseFees;
    }

    public int getPostCourseId() {
        return postCourseId;
    }

    public String getPostCourseName() {
        return postCourseName;
    }

    public double getPostCourseFees() {
        return postCourseFees;
    }
}
