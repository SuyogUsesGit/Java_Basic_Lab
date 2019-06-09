package day2.assignment3;

// Understanding the concept of switch case statements and switch cases
public class SwitchCaseStatement {
    public static void main(String[] args) {
        char grade = 'Z';
        switch (grade) {
            case 'A':
                System.out.println("80 - 100");
                break;
            case 'B':
                System.out.println("73 - 79");
                break;
            case 'C':
                System.out.println("65 - 72");
                break;
            case 'D':
                System.out.println("55 - 64");
                break;
            case 'E':
                System.out.println(" < 55");
            default:
                System.out.println("Grade does not exist");
        }
    }
}
