import java.util.Scanner;

public class BeerAndChips_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String footballFanName = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beersCount = Integer.parseInt(scanner.nextLine());
        int chipsCount = Integer.parseInt(scanner.nextLine());

        double beerPrice = beersCount * 1.20;
        double chipsPrice = Math.ceil((beerPrice * 0.45) * chipsCount);
        double totalSum = beerPrice + chipsPrice;
        if (budget >= totalSum) {
            double leftMoney = budget - totalSum;
            System.out.printf("%s bought a snack and has %.2f leva left.", footballFanName, leftMoney);
        } else {
            double neededMoney = totalSum - budget;
            System.out.printf("%s needs %.2f more leva!", footballFanName, neededMoney);
        }

    }
}
