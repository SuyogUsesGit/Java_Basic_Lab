package day2.selfreview;

public class TypeCasting {
    public static void main(String[] args) {
        int intVal = 10;
        double doubleVal = 20.0;

        // Explicit casting is required
        // inval = doubleVal;
        intVal = (int) doubleVal;
        System.out.println(intVal);

    }
}

class Demo {
    public static void main(String[] args) {
        if(true) {
            System.out.println("True Block");
        } else {
            System.out.println("Flase Block");
        }
    }
}

class Example {
    public static void main(String[] args) {
        int intValOne = 0;
        int intValTwo = 0;

        for(short index = 0; index < 5; index++) {
            if((++intValOne > 2) || (++intValTwo > 2)) {
                intValOne++;
            }
        }
        System.out.println("intValOne : " + intValOne + " intValTwo : " + intValTwo);
    }
}

class ExampleTwo {
    public static void main(String[] args) {
        int intValOne = 5, intValTwo = 7;
        System.out.println((intValTwo * 2) % intValOne);
        System.out.println(intValTwo % intValOne);
    }
}

class ExampleThree {
    public static void main(String[] args) {
        int val1 = 9;
        int val2 =6;

        for(int val3 = 0; val3 < 6; val3++,val2--) {
            if(val1 > 2) val1--;
            if(val1 > 5) {
                System.out.print(val1 + " ");
                --val1;
                continue;
            }
            val1--;
        }
    }
}

// Find the output of following program

class SwitchCase {
    public static void main(String[] args) {
        String comment;
        int val = 4*3;

        switch (val) {
            case 0:
                comment = "case 0";
            case 1:
                comment = "case 1";
            case 2:
                comment = "case 2";
            default:
                comment = "Oops -- Something is wrong";
        }
        System.out.println(comment);
    }
}