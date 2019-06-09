
/*
Solution:

Either use static instance count variable which will be shared among all
objects to auto-increment the id

OR use inbuilt AtomicInteger object to provide the same functionality and
in addition to that make the object thread safe

 */

package day2.assignment9;

import java.util.concurrent.atomic.AtomicInteger;

public class Student {
    //    private static int count = 549;
    private int id;
    private char type;
    private String name;
    private static AtomicInteger atomicInteger = new AtomicInteger(549);


    public Student(char type, String firstName, String lastName) {
        this.type = type;
        this.name = firstName + " " + lastName;
//        this.setId(++count);
        this.setId(atomicInteger.incrementAndGet());
    }

    public void displayDetails() {
        System.out.println(this.getName().toUpperCase() + " DETAILS" + "\n" + "***************");
        System.out.println("Name : " + this.getName() + "\n" +
                "ID : " + this.getId() + "\n" +
                "Type : " + this.getType() + "\n");
    }

    private int getId() {
        return id;
    }

    private char getType() {
        return type;
    }

    private String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }
}


