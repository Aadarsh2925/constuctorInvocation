package academy.learnprogramming;

public class Student {
    private int studentId;
    private char studentType;
    private String studentName;

    public Student(int studentId, char studentType, String studentName) {
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public String getStudentName() {
        return studentName;
    }
}
