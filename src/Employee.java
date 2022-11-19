public class Employee {
    public static final int FULL_TIME_PRESENT = 1;
    public static final int ABSENT = 0;
    public int isPresent() {
        int attendance = (int) (Math.floor(Math.random() * 10) % 2);
        if (attendance == FULL_TIME_PRESENT)
            return FULL_TIME_PRESENT;
        else
            return ABSENT;
    }
}
