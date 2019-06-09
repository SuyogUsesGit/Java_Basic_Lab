package day2.assignment8;

/*
Solution:

To maintain the appropriate coding standards,
make the following changes:

1) Use Employee as class name
2) Use id and salary as instance variables
3) create appropriate functions for checking employee by id, salary and new employee validity

 */

public class Employee {

    public static void main(String[] args) {
        int id = 22;
        int salary = 14000;
        Employee emp = new Employee();
        boolean idCheck = emp.newEmployeeCheckById(id);
        boolean salaryCheck = emp.newEmployeeCheckBySalary(salary);
        emp.isNewEmployee(idCheck, salaryCheck);
    }

    private boolean newEmployeeCheckById(int id) {
        return (id >= 20 && id <= 30);
    }

    private boolean newEmployeeCheckBySalary(int salary) {
        return (salary >= 14000 && salary <= 20000);
    }

    private void isNewEmployee(boolean k, boolean l) {
        if (k && l)
            System.out.println("Is a new Employee");
        else
            System.out.println("Is not a new Employee");
    }

}
