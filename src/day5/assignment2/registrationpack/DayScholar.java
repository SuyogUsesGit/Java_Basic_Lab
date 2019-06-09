package day5.assignment2.registrationpack;

import day5.assignment2.studentpack.Student;

public class DayScholar extends Student {
    private String residentialAddress;

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public void getDetails() {
        System.out.println("Student ID : " + getStudentId() + "\n" +
                            "Student Type : " + getStudentType() + "\n" +
                            "Student Name : " + getStudentName());
    }
}

class Registration {
    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar();
        dayScholar.setStudentId(1001);
        dayScholar.setStudentType('D');
        dayScholar.setStudentName("Dinil");
        dayScholar.getDetails();
    }
}
