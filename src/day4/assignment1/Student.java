package day4.assignment1;

public class Student {
    private int studentId;
    private char studentType;
    private String studentName;
    private double feesPerMonth;

    public Student() {

    }

    public Student(int studentId, char studentType, String firstName, String lastName) {
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = firstName + " " + lastName;
    }

    public Student(int studentId, char studentType, String name) {
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String firstName, String lastName) {
        this.studentName = firstName + " " + lastName;
    }

    public double getFeesPerMonth() {
        return feesPerMonth;
    }

    public void setFeesPerMonth(double feesPerMonth) {
        this.feesPerMonth = feesPerMonth;
    }
}
