package academy.learnprogramming;

public class DayScholar extends postGradStudent{
    private String residentialAddress;

    public DayScholar(int studentId, char studentType, String studentName, int postCourseId, String postCourseName, int postCourseFees, String residentialAddress) {
        super(studentId, studentType, studentName, postCourseId, postCourseName, postCourseFees);
        this.residentialAddress = residentialAddress;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }
    public double calculateFeePerMonth(){
        double fees=getPostCourseFees()/6;
        return fees;
    }
}
