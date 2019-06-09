package day4.assignment4;

// Problem 1
public class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected int semesterFees;
    protected int feesPerMonth;

    Student() {

    }

    Student(int studentId, char studentType, String studentName, int semesterFees) {
        super();
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = studentName;
        this.semesterFees = semesterFees;
    }

    void displayDetails() {
        System.out.println("ID : " + this.studentId + "\n" +
                            "Type : " + this.studentType + "\n" +
                            "Name : " + this.studentName + "\n" +
                            "Semester Fees : " + this.semesterFees);
    }
}

class DayScholar extends Student {
    private String residentialAddress;

    public DayScholar(int studentId, char studentType, String studentName, int semesterFees, String residentialAddress) {
        super(studentId, studentType, studentName, semesterFees);
        this.residentialAddress = residentialAddress;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Residential Address : " + this.residentialAddress);

    }
}

class CourseReg{
    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar(1001, 'D', "Eugene", 12000,
                "No 32/68 Vijay Nagar");
        dayScholar.displayDetails();
    }

}