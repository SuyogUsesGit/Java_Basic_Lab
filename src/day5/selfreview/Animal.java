package day5.selfreview;

// 1.

public abstract class Animal {
//    public static abstract void testClassMethod() {
//        System.out.println("The class method in animal");
//    }

    public abstract void testClassMethod();

    public void testInstanceMathod() {
        System.out.println("The Instance method in animal");
    }

}

class Cat extends Animal {
    public void testClassMethod() {
        System.out.println("The class method in cat");
    }

    public void testInstanceMathod() {
        System.out.println("The Instance method in cat");
    }

    public static void main(String[] args) {

        Cat cat = new Cat();
        Animal animal = cat;
        // Animal.testClassMethod();
        animal.testInstanceMathod();
    }
}

// 2.

interface Count {
    short counter = 0;
    void countUp();
}

class TestClass implements Count {
    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.countUp();
    }
    @Override
    public void countUp() {
        for(int x=6; x>counter; x--) {
            System.out.println(" " + counter);
        }
    }
}

// 3.


interface ParentOne {
    int pOne = 1;
    void printParentOne();

}

interface ParentTwo {
    int pTwo = 2;
    void printParentTwo();
}

interface Child extends ParentOne, ParentTwo {
    int child = 3;
    void printChild();
}

class InheritClass implements Child {
    @Override
    public void printParentOne() {
        System.out.println(pOne);
    }

    @Override
    public void printParentTwo() {
        System.out.println(pTwo);
    }

    @Override
    public void printChild() {
        System.out.println(child);
    }
}

class TestInterface {
    public static void main(String[] args) {
        InheritClass ihc = new InheritClass();
        ihc.printParentOne();
        ihc.printParentTwo();
        ihc.printChild();
    }
}