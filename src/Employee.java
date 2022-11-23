import javax.print.StreamPrintServiceFactory;

public class Employee {
    public static final int FULL_TIME_PRESENT = 1;
    public static final int PART_TIME_PRESENT = 2;
    public static final int ABSENT = 0;
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 4;

    public int isPresent() {
        int attendance = (int) Math.floor(Math.random() * 3);
        if (attendance == FULL_TIME_PRESENT)
            return FULL_TIME_PRESENT;
        if (attendance == PART_TIME_PRESENT)
            return PART_TIME_PRESENT;
        else
            return ABSENT;
    }

    public int getDailyWage(int attendance) {
        if (attendance == FULL_TIME_PRESENT)
            return WAGE_PER_HOUR * FULL_DAY_HOURS;
        else
            return WAGE_PER_HOUR * PART_TIME_HOURS;
    }
}
