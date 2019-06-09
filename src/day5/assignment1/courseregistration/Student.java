package day5.assignment1.courseregistration;

public class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void getDetails() {
        System.out.println("Student ID : " + this.studentId + "\n" +
                            "Student Type : " + this.studentType + "\n" +
                            "Student Name : " + this.studentName);
    }
}

class PackageEx {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(1001);
        student.setStudentName("Thomas");
        student.setStudentType('D');
        student.getDetails();
    }
}