package day4.assignment7;

public class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected int semesterFees = 12000;
    protected double feesPerMonth;

    public Student() {

    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void calculateFees() {
        this.feesPerMonth = semesterFees / 6.0;
    }

    public void displayDetails() {

    }

}

    final class DayScholar extends Student {
        private String residentialAddress;

        public DayScholar(int studentId, char studentType, String studentName, int feesPerMonth, String residentialAddress) {
            this.setStudentId(studentId);
            this.setStudentName(studentName);
            this.setStudentType(studentType);
            this.feesPerMonth = feesPerMonth;
            this.residentialAddress = residentialAddress;
        }

        public void displaySDetails() {
            System.out.println("Student ID : " + this.studentId + "\n" +
                    "Student Type : " + this.studentType + "\n" +
                    "Student Name : " + this.studentName + "\n" +
                    "Fees per month : " + this.feesPerMonth + "\n" +
                    "Semester Fees : " + this.semesterFees + "\n" +
                    "Residential Address : " + this.residentialAddress);
        }

        public static void main(String[] args) {
            DayScholar dayScholar = new DayScholar(1, 'Z', "Sanket", 12000,
                    "India");
            dayScholar.calculateFees();
            dayScholar.displaySDetails();
        }
    }
