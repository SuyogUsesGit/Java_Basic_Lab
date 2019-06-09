package day5.assignment3;

public interface InterOne {
    int varOne = 0;
    int varTwo = 100;
    void methodOne();
    void methodTwo();
}

class Example implements InterOne {
    @Override
    public void methodOne() {
//        varTwo += 10;           // will not work because instance variables in an interface are final
        System.out.println("Value of var2 = " + varTwo);
        System.out.println("Good Morning");
    }

    @Override
    public void methodTwo() {
        System.out.println("Good Afternoon");
    }
}

class DemoInterface {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.methodOne();
        obj.methodTwo();
    }
}