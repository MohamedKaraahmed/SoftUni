import java.util.Scanner;

public class GoldMine_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locationsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= locationsCount; i++) {
            double totalGold = 0;
            double expectedAverageGoldPerDay = Double.parseDouble(scanner.nextLine());
            int daysMiningInThisLocation = Integer.parseInt(scanner.nextLine());

            for (int j = 1; j <= daysMiningInThisLocation; j++) {
                double minedGoldForToday = Double.parseDouble(scanner.nextLine());
                totalGold = totalGold + minedGoldForToday;

            }
            double avgGold = totalGold / daysMiningInThisLocation;
            if (avgGold >= expectedAverageGoldPerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", avgGold);

            } else {
                double neededGold = expectedAverageGoldPerDay - avgGold;
                System.out.printf("You need %.2f gold.%n", neededGold);

            }

        }

    }
}
