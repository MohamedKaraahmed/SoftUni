import java.util.Scanner;

public class HappyCatParking_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;
        for (int day = 1; day <= days; day++) {
            double sum = 0;
            for (int hour = 1; hour <= hours; hour++) {
                if (day % 2 == 0 && hour % 2 != 0) {
                    // 2.50
                    sum = sum + 2.50;
                    totalSum += 2.50;
                } else if (day % 2 != 0 && hour % 2 == 0) {
                    //1.25
                    sum += 1.25;
                    totalSum += 1.25;
                } else {
                    //1.00
                    sum += 1.00;
                    totalSum += 1;
                }

            }
            System.out.printf("Day: %s - %.2f leva%n", day, sum);
        }
        System.out.printf("Total: %.2f leva", totalSum);
    }
}
