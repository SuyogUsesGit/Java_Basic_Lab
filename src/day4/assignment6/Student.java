package day4.assignment6;

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

    public void getStudentDetails() {
        System.out.println("Student ID : " + this.studentId);
        System.out.println("Student type : " + this.studentType);
    }

}

class DayScholar extends Student {
    private String residentialAddress;

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    @Override
    public void getStudentDetails() {
        super.getStudentDetails();
        System.out.println("Student Name : " + this.studentName);
        System.out.println("Residential Address : " + this.residentialAddress);
    }
}

class DynamicEx {
    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar();
        dayScholar.setStudentId(1001);
        dayScholar.setStudentType('D');
        dayScholar.setStudentName("Thomas");
        dayScholar.setResidentialAddress("32/3 Vijaynagar");
        dayScholar.getStudentDetails();
    }
}
