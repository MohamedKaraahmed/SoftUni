import java.util.Scanner;

public class FuelTank_Part2_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double amountFuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();
        double totalSum = 0;

        if (clubCard.equals("Yes")) {
            if (fuelType.equals("Gas")) {
                totalSum = amountFuel * 0.85;
            } else if (fuelType.equals("Gasoline")) {
                totalSum = amountFuel * 2.04;
            } else if (fuelType.equals("Diesel")) {
                totalSum = amountFuel * 2.21;
            }
        } else {
            if (fuelType.equals("Gas")) {
                totalSum = amountFuel * 0.93;
            } else if (fuelType.equals("Gasoline")) {
                totalSum = amountFuel * 2.22;
            } else if (fuelType.equals("Diesel")) {
                totalSum = amountFuel * 2.33;
            }
        }
        if (amountFuel >= 20 && amountFuel <= 25) {
            totalSum = totalSum * 0.92;
        } else if (amountFuel >= 25) {
            totalSum = totalSum * 0.90;
        }
        System.out.printf("%.2f lv.", totalSum);
    }
}
