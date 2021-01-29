package util;

public class PerformCheck {

    public static long startTime;
    public static long endTime;

    public static void setStartTime() {
        startTime = System.currentTimeMillis();
    }

    public static void setEndTime() {
        endTime = System.currentTimeMillis();
        long diffTime = (endTime - startTime) / 1000;
        System.out.println("times : " + diffTime);
    }
}
