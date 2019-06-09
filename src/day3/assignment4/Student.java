package day3.assignment4;

public class Student {
    private int studentId;
    private char studentType;
    private String studentName;

    public Student() {
        this.studentId = 10;
        this.studentType = 'F';
    }

    public Student(int studentId, char studentType, String firstName, String lastName) {
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = firstName + " " + lastName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public void setStudentName(String firstName, String lastName) {
        this.studentName = firstName + " " + lastName;
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

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentName("Suyog", "Gaikwad");
        Student student2 = new Student(11, 'F', "Sanket", "Mhaske");
        student1.displayStudentDetails();
        student2.displayStudentDetails();

    }

    public void displayStudentDetails() {
        System.out.println("ID : " + this.getStudentId() + "\n" +
                "Full Name : " + this.getStudentName() + "\n" +
                "Type : " + this.getStudentType() + "\n");
    }
}
