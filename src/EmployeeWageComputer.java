public class EmployeeWageComputer {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computer");

        Employee empObj = new Employee();
        int attendance = empObj.isPresent();

        if (attendance > Employee.ABSENT) {
            int dailyWage = empObj.getDailyWage(attendance);
            System.out.println("Daily Wage = " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Daily Wage = 0");
        }
    }
}