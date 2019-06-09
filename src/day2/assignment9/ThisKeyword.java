package day2.assignment9;

public class ThisKeyword {
    public static void main(String[] args) {
        Student studentOne = new Student('B', "Bony", "Thomas");
        Student studentTwo = new Student('H', "Dinil", "Bose");
        studentOne.displayDetails();
        studentTwo.displayDetails();
    }
}
