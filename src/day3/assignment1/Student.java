package day3.assignment1;

public class Student {
    private static int studentCount;
    private int id;
    private char type;
    private String name;

    public Student() {
        this.id = ++studentCount;
    }

    public Student(char type, String firstName, String lastName) {
        this.type = type;
        this.name = firstName + " " + lastName;
    }

    static {
        studentCount = 10;
    }

    public void displayDetails() {
        System.out.println(this.getName().toUpperCase() + " DETAILS" + "\n" + "***************");
        System.out.println("Name : " + this.getName() + "\n" +
                "ID : " + this.getId() + "\n" +
                "Type : " + this.getType() + "\n");
    }

    public int getId() {
        return id;
    }

    private char getType() {
        return type;
    }

    private String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}

