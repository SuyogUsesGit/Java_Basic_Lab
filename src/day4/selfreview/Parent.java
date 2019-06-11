package day4.selfreview;

// 1

class Parent {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void display() {
        System.out.println("Number : " + num);
    }

}

class Child extends Parent {
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void disply() {
        System.out.println("Number : " + getNum());
        System.out.println("Value : " + val);
    }
}

class CourseMgmt {
    public static void main(String[] args) {
        Child child = new Child();
        child.setNum(100);
        child.setVal(200);
        child.disply();
    }
}

// 2

class Parent2 {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void display() {
        System.out.println("Number : " + num);
    }

}

class Child2 extends Parent2 {
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void disply() {
        super.display();
        System.out.println("Value : " + val);
    }
}

class CourseMgmt2 {
    public static void main(String[] args) {
        Child child = new Child();
        child.setNum(100);
        child.setVal(200);
        child.disply();
    }
}

// 3.

class Animal {
    public static void testClassMethod() {
        System.out.println("The class method in animal");
    }

    public void testInstanceMathod() {
        System.out.println("The Instance method in animal");
    }

}

class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The class method in cat");
    }

    public void testInstanceMathod() {
        System.out.println("The Instance method in cat");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = cat;
        animal.testClassMethod();
        cat.testInstanceMathod();
    }
}

// 4.

class Parent3 {
    int num;

    Parent3(){

    }

    Parent3(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

}

class Child3 extends Parent3 {
    private int val;

    Child3(int num, int val) {
        super(num);
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}

class CourseMgmt3 {
    public static void main(String[] args) {
        Child3 child3 = new Child3(100, 200);
        System.out.println("Parent: Num = " + child3.getNum());
        System.out.println("Child: Val = " + child3.getVal());
    }
}

// 5.

class ClassA {
    public void methodOne(int i) {

    }

    public void methodTwo(int i) {

    }

    public static void methodThree(int i) {

    }

    public static void methodFour(int i) {

    }
}

class ClassB extends ClassA {
    public void methodOne(int i) {

    }

    public void methodTwo(int i) {

    }

    public static void methodThree(int i) {

    }

    public static void methodFour(int i) {

    }

    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.methodOne(1);
        ClassA.methodFour(12);
    }
}

