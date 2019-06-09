package day4.assignment8;

public class DayScholar extends Student {
    private String residentialAddress;

    public DayScholar() {

    }

    public DayScholar(int studentId, char studentType, String name, double feesPerMonth, String residentialAddress) {
        super(studentId, studentType, name);
        this.feesPerMonth = feesPerMonth;
        this.residentialAddress = residentialAddress;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println(
                "Fees : " + this.getFeesPerMonth() + "\n" +
                "Residential Address : " + this.getResidentialAddress());

    }

    @Override
    void calculateFees(double semesterFees) {
        this.feesPerMonth = semesterFees / 6.0;
    }
}
