package day3.assignment7;

public class Student {
    private int studentId;
    private String studentName;
    private String residentialStatus;
    private long feesPerMonth;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
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

    public long getFeesPerMonth() {
        return feesPerMonth;
    }

    public void setFeesPerMonth(long feesPerMonth) {
        this.feesPerMonth = feesPerMonth;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(Integer.parseInt(args[0]));
        student.setStudentName(args[1]);
        student.setResidentialStatus(args[2]);
        student.setFeesPerMonth(Integer.parseInt(args[3]));

        System.out.println("Student Details : " +
                            "Name : " + student.getStudentName() + "\n" +
                            "ID : " + student.getStudentId() + "\n" +
                            "Residential Status : " + student.getResidentialStatus() + "\n" +
                            "Semester Fees : " + student.getFeesPerMonth() + "$" + "\n");

        if(student.getResidentialStatus().equals("Hostelite")) System.out.println("Hostel fees : 100$");


    }

}

