package day4.assignment1;

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

    public static void main(String[] args) {
        Hostelite hostelite = new Hostelite(1, 'F', "Suyog Gaikwad", 5000,
                "Javelina Station", 505);

        System.out.println("Student Name : " + hostelite.getStudentName() + "\n" +
                            "StudentID : " + hostelite.getStudentId() + "\n" +
                            "StudentType : " + hostelite .getStudentType() + "\n" +
                            "Fees : " + hostelite.getFeesPerMonth() + "\n" +
                            "Hostel Name : " + hostelite.getHostelName() + "\n" +
                            "Room Number : " + hostelite.getRoomNumber());

    }
}
