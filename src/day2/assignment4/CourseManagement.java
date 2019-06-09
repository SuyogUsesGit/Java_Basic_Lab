package day2.assignment4;

public class CourseManagement {
    public static void main(String[] args) {
        int id = 1;
        char type = 'L';
        Student student= new Student();
        student.setStudentId(id);
        student.setStudentType(type);

        System.out.println(student.getStudentId());
        System.out.println(student.getStudentType());
    }
}
