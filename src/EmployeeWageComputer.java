public class EmployeeWageComputer {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computer");
        Employee empObj = new Employee();
        int attendance = empObj.isPresent();
        if(attendance==Employee.FULL_TIME_PRESENT)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}