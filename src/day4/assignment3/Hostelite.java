package day4.assignment3;

public class Hostelite extends Student {
    private String hostelName;
    private int roomNumber;

    public Hostelite() {

    }

    public Hostelite(int studentId, char studentType, String name, double feesPerMonth, String hostelName, int roomNumber) {
        super(studentId, studentType, name);
        this.setFeesPerMonth(feesPerMonth);
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println(
                "Fees : " + this.getFeesPerMonth() + "\n" +
                "Hostel Name : " + this.getHostelName() + "\n" +
                "Room Number : " + this.getRoomNumber());
    }
}
