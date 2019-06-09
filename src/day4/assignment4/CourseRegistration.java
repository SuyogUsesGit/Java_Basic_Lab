package day4.assignment4;


// Problem 2

public class CourseRegistration {

    static protected int regId;
    protected String courseName;

    CourseRegistration() {
        regId++;
    }

    CourseRegistration(String courseName) {
        this();
        this.courseName = courseName;
    }

    public void displayDetails() {
        System.out.println("Registration ID : " + regId + "\n" +
                            "Course Name : " + this.courseName);
    }
}

class StudentTwo extends CourseRegistration {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected int semesterFees;
    protected int feesPerMonth;

    StudentTwo() {

    }

    public StudentTwo(String courseName, int studentId, char studentType, String studentName, int semesterFees, int feesPerMonth) {
        super(courseName);
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = studentName;
        this.semesterFees = semesterFees;
        this.feesPerMonth = feesPerMonth;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID : " + this.studentId + "\n" +
                            "Student Type : " + this.studentType + "\n" +
                            "Student Name : " + this.studentName + "\n" +
                            "Semester Fees : " + this.semesterFees + "\n" +
                            "Fees per month : " + this.feesPerMonth);
    }
}

class DayScholar2 extends StudentTwo {
    private String residentialAddress;

    public DayScholar2(String courseName, int studentId, char studentType, String studentName, int semesterFees, int feesPerMonth, String residentialAddress) {
        super(courseName, studentId, studentType, studentName, semesterFees, feesPerMonth);
        this.residentialAddress = residentialAddress;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Residential Address : " + this.residentialAddress);

    }
}

class CourseRegTwo {
    public static void main(String[] args) {
        DayScholar2 dayScholar2 = new DayScholar2("Compiler Design", 1, 'F', "Eugene",
                                                 12000, 500, "No 32/68 Vijaynagar");
        dayScholar2.displayDetails();
    }
}