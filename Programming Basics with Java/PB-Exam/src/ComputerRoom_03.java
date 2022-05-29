import java.util.Scanner;

public class ComputerRoom_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int hoursCount = Integer.parseInt(scanner.nextLine());
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        double totalSum = 0;
        double pricePerHour = 0;
        switch (dayTime) {
            case "day":
                if (month.equals("march")) {
                    pricePerHour = 10.50;
                    totalSum = hoursCount * 10.50 * peopleCount;
                } else if (month.equals("april")) {
                    pricePerHour = 10.50;
                    totalSum = hoursCount * 10.50 * peopleCount;
                } else if (month.equals("may")) {
                    pricePerHour = 10.50;
                    totalSum = hoursCount * 10.50 * peopleCount;
                } else if (month.equals("june")) {
                    pricePerHour = 12.60;
                    totalSum = hoursCount * 12.60 * peopleCount;
                } else if (month.equals("july")) {
                    pricePerHour = 12.60;
                    totalSum = hoursCount * 12.60 * peopleCount;
                } else if (month.equals("august")) {
                    pricePerHour = 12.60;
                    totalSum = hoursCount * 12.60 * peopleCount;
                }
                if (peopleCount >= 4) {
                    pricePerHour = pricePerHour * 0.90;
                    totalSum = totalSum * 0.90;
                }
                if (hoursCount >= 5) {
                    pricePerHour = pricePerHour * 0.50;
                    totalSum = totalSum - (totalSum * 0.50);
                }
                break;

            case "night":
                if (month.equals("march")) {
                    pricePerHour = 8.40;
                    totalSum = hoursCount * 8.40 * peopleCount;
                } else if (month.equals("april")) {
                    pricePerHour = 8.40;
                    totalSum = hoursCount * 8.40 * peopleCount;
                } else if (month.equals("may")) {
                    pricePerHour = 8.40;
                    totalSum = hoursCount * 8.40 * peopleCount;
                } else if (month.equals("june")) {
                    pricePerHour = 10.20;
                    totalSum = hoursCount * 10.20 * peopleCount;
                } else if (month.equals("july")) {
                    pricePerHour = 10.20;
                    totalSum = hoursCount * 10.20 * peopleCount;
                } else if (month.equals("august")) {
                    pricePerHour = 10.20;
                    totalSum = hoursCount * 10.20 * peopleCount;
                }
                if (peopleCount >= 4) {
                    pricePerHour = pricePerHour * 0.90;
                    totalSum = totalSum * 0.90;
                }
                if (hoursCount >= 5) {
                    pricePerHour = pricePerHour * 0.50;
                    totalSum = totalSum - (totalSum * 0.50);
                }
                break;
            default:
                break;
        }
        System.out.printf("Price per person for one hour: %.2f%n", pricePerHour);
        System.out.printf("Total cost of the visit: %.2f", totalSum);

    }
}
