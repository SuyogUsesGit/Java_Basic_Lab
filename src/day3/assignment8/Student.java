package day3.assignment8;

public class Student {
    private int studentId;
    private char studentType;
    private String studentName;
    private String residentialStatus;
    private double feesPerMonth;

    public Student() {

    }

    public Student(int studentId, char studentType, String firstName, String lastName) {
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = firstName + " " + lastName;

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
        this.studentName = firstName + lastName;
    }

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public void setResidentialStatus(String residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public double getFeesPerMonth() {
        return feesPerMonth;
    }

    public void setFeesPerMonth(double feesPerMonth) {
        this.feesPerMonth = feesPerMonth;
    }


    public void calculateFees(double semesterFees) {
        this.feesPerMonth = semesterFees / 6.0;
    }

    public void calculateFees(double semesterFees, double hostelFees) {
        calculateFees(semesterFees);
        this.feesPerMonth += hostelFees;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, 'F', "Suyog", "Gaikwad");
        Student student2 = new Student(2 , 'F', "Sanket", "Mhaske");
        student1.setResidentialStatus("Day Scholar");
        student2.setResidentialStatus("Hostelite");
        student1.displayDetails();
        student2.displayDetails();
    }

    public void displayDetails() {
        System.out.println("Name : " + this.getStudentName() + "\n" +
                            "ID : " + this.getStudentId() + "\n" +
                            "Residential status : " + this.getResidentialStatus());
        if(this.getResidentialStatus().equals("Day Scholar")) {
            calculateFees(5000);
        } else {
            calculateFees(5000, 500);
        }
        System.out.println("Fees : " + String.format("%.2f", this.getFeesPerMonth()) + "\n");

    }
}
