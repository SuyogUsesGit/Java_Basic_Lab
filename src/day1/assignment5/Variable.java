package day1.assignment5;

// Program to understand local variables and literals
public class Variable {
    private static int intVal;

    public static void main(String[] args) {

//        int intVal = 0;
        float floatVal = 250.5f;
        double doubleVal = 2500.5;
        boolean boolVal = true;
        System.out.println("Integer\t:" + intVal + "\nFloat\t:" +
                            floatVal + "\nDouble\t:" + doubleVal + "\nBoolean\t:" + boolVal);
    }
}



/*
Solution:
    Either Declare intVal as static instance variable
    Or initialize the local variable to some valid value
 */