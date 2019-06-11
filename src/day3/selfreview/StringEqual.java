package day3.selfreview;

// 1.

public class StringEqual {
    public static void main(String[] args) {
        String name1, name2;

        name1 = "God"; name2 = name1;
        if(name1 == name2) System.out.println("Equal");
        else System.out.println("Not Equal");
    }
}

// 2.

class StringEqual2 {
    public static void main(String[] args) {
        String name1, name2;
        name1 = new String("God");
        name2 = new String("God");
        if(name1 == name2) System.out.println("Equal");
        else System.out.println("Not Equal");
    }
}

// 3.

class StringEqual3 {
    public static void main(String[] args) {
        String name1, name2;
        name1 = new String("God");
        name2 = new String("God");
        if(name1.equals(name2)) System.out.println("Equal");
        else System.out.println("Not Equal");
    }
}

// 4.

class StaticDemo {
    static int count = 10;

    StaticDemo() {
        count++;
    }

    static void display() {
        System.out.println(count);
    }

    static {
        System.out.println("Static Block written before main");
    }

    public static void main(String[] args) {
        StaticDemo t1 = new StaticDemo();
        StaticDemo t2 = new StaticDemo();
        StaticDemo.display();
        t2.display();
    }

    static {
        System.out.println("Static Block Written After main");
    }

}

// 5.

class MultiDimArray {
    public static void main(String[] args) {
        String[][] names = {{"Mrs.", "Ms.", "Mr."}, {"Vani", "Lesitha", "Nishit", "Meenakshi"}};
        System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][2] + names[1][2]);
    }
}

// 6.

class StaticDemo1 {
    private static int num;
    static void display() {
        System.out.println(num);
    }

    public static void main(String[] args) {
        StaticDemo1.display();
    }
}

// What will be the output of the following

class TheSample {
    public static void main(String[] args) {
        Square square = new Square();
        square.display(5);
        int area = square.calculateArea();
        System.out.println("The area of the square is : " + area);
    }
}
class Square {
    int length;
    void display(int length) {
        this.length = length;
    }
    int calculateArea() {
        return(length * length);
    }
}

