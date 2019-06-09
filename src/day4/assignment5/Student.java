package day4.assignment5;

public class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;

    public Student() {

    }

    public Student(int studentId, char studentType, String studentName) {
        System.out.println("In Student Constructor");
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = studentName;
    }


}
