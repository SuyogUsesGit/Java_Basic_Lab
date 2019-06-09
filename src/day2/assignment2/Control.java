package day2.assignment2;

// Program to understand loop and break
public class Control {
    public static void main(String[] args) {
        boolean bool = true;

        for(int i=0; i<5; i++) {
            for(int j=0; j<10; j++) {
                System.out.print(j + "\t");
                if(j > 5) break;
            }
            System.out.println("Outer Loop");
        }
        System.out.println("End");
    }
}
