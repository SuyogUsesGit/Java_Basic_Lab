package day4.assignment3;

public class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected double feesPerMonth;
    protected String residentialStatus;

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

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public void setResidentialStatus(String residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name : " + this.getStudentName() + "\n" +
                "StudentID : " + this.getStudentId() + "\n" +
                "StudentType : " + this .getStudentType());
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(Integer.parseInt(args[0]));
        student.setStudentName(args[1] , args[2]);
        student.setStudentType(args[3].charAt(0));
        student.setFeesPerMonth(Double.parseDouble(args[4]));
        student.setResidentialStatus(args[5]);

        if(student.getResidentialStatus().equals("DayScholar")) {
            DayScholar dayScholar = new DayScholar(student.getStudentId(), student.getStudentType(),
                                                    student.getStudentName(), student.getFeesPerMonth(),
                                                    "Test Address");
            dayScholar.displayStudentDetails();
        } else {
            Hostelite hostelite = new Hostelite(student.getStudentId(), student.getStudentType(),
                    student.getStudentName(), student.getFeesPerMonth(), "Bishop Hall", 505);
            hostelite.displayStudentDetails();
        }
    }
}

