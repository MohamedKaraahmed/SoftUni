import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (flowers.equals("Roses")) {
            if (count > 80) {
                price = count * 5 * 0.90;
            } else {
                price = count * 5;
            }

        } else if (flowers.equals("Dahlias")) {
            if (count > 90) {
                price = count * 3.80 * 0.85;
            } else {
                price = count * 3.80;
            }

        } else if (flowers.equals("Tulips")) {
            if (count > 80) {
                price = count * 2.80 * 0.85;
            } else {
                price = count * 2.80;
            }

        } else if (flowers.equals("Narcissus")) {
            if (count < 120) {
                price = count * 3 * 1.15;

            } else {
                price = count * 3;
            }
        } else {
            if (count < 80) {
                price = count * 2.50 * 1.20;
            } else {
                price = count * 2.50;
            }

        }
        double diff = Math.abs(budget - price);
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowers, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
