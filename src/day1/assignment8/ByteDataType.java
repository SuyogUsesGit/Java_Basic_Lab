package day1.assignment8;

public class ByteDataType {
    public static void main(String[] args) {
        int intVal = 100;
        byte byteVal = (byte) intVal;
        byte max  = 127;
        byte min  = -128;
//        byte sum = (max + min);
//        System.out.println("Sum = " + sum);
    }
}

/*
Solution
The compilation error is: Error:(9, 25) java: incompatible types: possible lossy conversion from int to byte
 */
