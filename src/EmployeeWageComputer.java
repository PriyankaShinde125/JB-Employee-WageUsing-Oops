public class EmployeeWageComputer {
    public static void main(String[] args) {
        int totalWage = 0;
        System.out.println("Welcome to Employee Wage Computer");

        Employee empObj = new Employee();
        for (int i = 0; i < Employee.MONTHLY_WORKING_DAYS; i++) {
            int attendance = empObj.isPresent();
            int dailyWage = empObj.getDailyWage(attendance);
            totalWage = totalWage + dailyWage;
        }
        System.out.println("Total wage = " + totalWage);
    }
}