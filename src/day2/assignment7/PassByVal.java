package day2.assignment7;

public class PassByVal {
    public static void main(String[] args) {
        int sId = 25;
        PassByVal val = new PassByVal();
        /*
        Uncomment this code to see pass by value functionality
        System.out.println(sId);
        val.passTheValueMethod(sId);
        System.out.println("The sId is " + sId);
        */
        Student student = new Student();
        student.setStudentId(sId);
        System.out.println(student.getStudentId());
        val.passTheValueMethod(student);
        System.out.println(student.getStudentId());
    }

    public void passTheValueMethod(int sId) {
        sId = 10;
        System.out.println("The sId is " + sId);
    }

    private void passTheValueMethod(Student student) {
        student.setStudentId(20);
        System.out.println("The sId is " + student.getStudentId());
    }

}

/*
Q) There is no change in studentId. Why?
Solution : In case of pass by value the scope of variable is restricted to the method
            so the value of instance variable does not change.

Q) There is a change in studentID. Why?
Solution: when the value of Object is changed using the setter method,
            it will be applied to all the references of that Object.

 */