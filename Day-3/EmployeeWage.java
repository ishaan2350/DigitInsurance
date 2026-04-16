import java.util.Random;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOURS = 8;
    static final int PART_TIME_HOURS = 4;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_HOURS = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation");

        int totalHours = 0;
        int totalDays = 0;

        Random rand = new Random();

        while (totalHours <= MAX_HOURS && totalDays < MAX_WORKING_DAYS) {

            totalDays++;

            int empCheck = rand.nextInt(3); // 0,1,2
            int empHours = 0;

            switch (empCheck) {
                case 1:
                    empHours = FULL_TIME_HOURS;
                    break;
                case 2:
                    empHours = PART_TIME_HOURS;
                    break;
                default:
                    empHours = 0;
            }

            totalHours += empHours;
            System.out.println("Day " + totalDays + " Hours: " + empHours);
        }

        int totalSalary = totalHours * WAGE_PER_HOUR;

        System.out.println("Total Hours: " + totalHours);
        System.out.println("Total Salary: " + totalSalary);
    }
}
