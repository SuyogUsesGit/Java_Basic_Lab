package day3.assignment5;

public class JavaDoc {
    String userName;

    public JavaDoc(String userName) {
        this.userName = userName;
        System.out.println("Hi, " + this.userName);
        System.out.println("Your name is " + this.userName.length() + " characters long");
        System.out.println("Lowercase : " + this.userName.toLowerCase());
        System.out.println("Uppercase : " + this.userName.toUpperCase());
        if((this.userName.charAt(0)+"".toLowerCase()).equals("a"))
            System.out.println("Your name starts with letter 'A'");
        else System.out.println("Your name does not start with letter 'A");
        this.userName = "KRISHNA";
        System.out.println("User name has been changed to " + this.userName);
    }

    public static void main(String[] args) {
        JavaDoc jd = new JavaDoc("Suyog");
    }
}
