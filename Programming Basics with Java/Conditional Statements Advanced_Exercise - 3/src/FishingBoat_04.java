import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (season.equals("Spring")) {
            price = 3000;

        } else if (season.equals("Summer")) {
            price = 4200;

        } else if (season.equals("Autumn")) {
            price = 4200;

        } else {
            price = 2600;

        }

        if (fishers <= 6) {
            price = price * 0.90;

        } else if (fishers <= 11) {
            price = price * 0.85;

        } else {
            price = price * 0.75;
        }
        if (fishers % 2 == 0 && !season.equals("Autumn")) {
            price = price * 0.95;
        }
        double diff = Math.abs(price - budget);

        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }


    }

}
