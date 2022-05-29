import java.util.Scanner;

public class Firm_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        int daysNeeded = Integer.parseInt(scanner.nextLine());
        int countWorkers = Integer.parseInt(scanner.nextLine());

        double oneWorkingDay = (daysNeeded * 0.90) * 8;
        int overtimeWork = countWorkers * (2 * daysNeeded);
        double totalHours = Math.floor(oneWorkingDay + overtimeWork);
        if (totalHours >= hoursNeeded) {
            System.out.printf("Yes!%.0f hours left.", totalHours - hoursNeeded);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", hoursNeeded - totalHours);
        }
    }
}
