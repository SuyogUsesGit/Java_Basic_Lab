package day2.assignment1;

public class Typecasting {
    public static void main(String[] args) {
        int intVal = 100;
        byte byteVal = (byte) intVal;
        byte max  = 127;
        byte min  = -128;
        byte sum = (byte) (max + min);
        System.out.println("Sum = " + sum);
    }
}

/*
Soultion
Add a byte cast to the sum variable to get the desired output
 */
