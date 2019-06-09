package day4.assignment5;

public class DayScholar extends PostGradStudent {
    private String residentialAddress;
    private int fees;

    public DayScholar(int studentId, char studentType, String studentName, int postCourseId, String postCourseName, int postCourseFees, String residentialAddress) {
        super(studentId, studentType, studentName, postCourseId, postCourseName, postCourseFees);
        System.out.println("In DayScholar constructor");
        this.residentialAddress = residentialAddress;
    }

    public void calculateFees() {
        this.fees = this.postCourseFees / 6;
    }

    public int getFees() {
        return fees;
    }

    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar(5, 'D', "Manu", 1001,
                                            "OOP", 16000, "No 32/3 Vijaynagar");
        dayScholar.calculateFees();
        System.out.println("Fees : " + dayScholar.getFees());
    }
}
