import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int peopleCount = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0;
        if (peopleCount > 0 && peopleCount <= 4) {
            budget = budget * 0.25;
        } else if (peopleCount > 4 && peopleCount <= 9) {
            budget = budget * 0.40;
        } else if (peopleCount > 9 && peopleCount <= 24) {
            budget = budget * 0.50;
        } else if (peopleCount > 24 && peopleCount <= 49) {
            budget = budget * 0.60;
        } else {
            budget = budget * 0.75;
        }
        if (category.equals("VIP")) {
            ticketPrice = peopleCount * 499.99;
        } else if (category.equals("Normal")) {
            ticketPrice = peopleCount * 249.99;
        }
        if (budget >= ticketPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - ticketPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", ticketPrice - budget);
        }
    }
}
