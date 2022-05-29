import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int restDays = Integer.parseInt(scanner.nextLine());

        int workingDaysPlayInMin = (365 - restDays) * 63;
        int restDaysPlayInMin = restDays * 127;
        int allTimeForPlayMin = workingDaysPlayInMin + restDaysPlayInMin;

        int normForYear = 30000;
        int leftTimeHours = Math.abs(normForYear - allTimeForPlayMin) / 60;
        int leftTimeMin = Math.abs(normForYear - allTimeForPlayMin) % 60;

        if (allTimeForPlayMin > normForYear) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play ", leftTimeHours, leftTimeMin);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", leftTimeHours, leftTimeMin);
        }


    }
}
