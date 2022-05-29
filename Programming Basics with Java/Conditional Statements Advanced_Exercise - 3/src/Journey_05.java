import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String kindHoliday = "";
        double sum = 0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                sum = budget * 0.30;
                kindHoliday = "Camp";
            } else {
                sum = budget * 0.70;
                kindHoliday = "Hotel";
            }

        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                sum = budget * 0.40;
                kindHoliday = "Camp";
            } else {
                kindHoliday = "Hotel";
                sum = budget * 0.80;
            }

        } else {
            destination = "Europe";
            sum = budget * 0.90;
            kindHoliday = "Hotel";

        }
        System.out.printf("Somewhere in %s %n", destination);
        System.out.printf("%s - %.2f", kindHoliday, sum);
    }
}