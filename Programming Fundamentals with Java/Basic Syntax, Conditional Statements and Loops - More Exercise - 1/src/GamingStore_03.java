import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();
        double yourMoney = balance;//parite koito ima

        while (!input.equals("Game Time")) {
            String game = input;
            if (game.equals("OutFall 4")) {
                if (yourMoney < 39.99) {
                    System.out.println("Too Expensive");
                } else {
                    yourMoney = yourMoney - 39.99;
                    System.out.printf("Bought %s%n", game);
                }
            } else if (game.equals("CS: OG")) {
                if (yourMoney < 15.99) {
                    System.out.println("Too Expensive");
                } else {
                    yourMoney = yourMoney - 15.99;
                    System.out.printf("Bought %s%n", game);
                }

            } else if (game.equals("Zplinter Zell")) {
                if (yourMoney < 19.99) {
                    System.out.println("Too Expensive");
                } else {
                    yourMoney = yourMoney - 19.99;
                    System.out.printf("Bought %s%n", game);
                }

            } else if (game.equals("Honored 2")) {
                if (yourMoney < 59.99) {
                    System.out.println("Too Expensive");
                } else {
                    yourMoney = yourMoney - 59.99;
                    System.out.printf("Bought %s%n", game);
                }

            } else if (game.equals("RoverWatch")) {
                if (yourMoney < 29.99) {
                    System.out.println("Too Expensive");
                } else {
                    yourMoney = yourMoney - 29.99;
                    System.out.printf("Bought %s%n", game);
                }

            } else if (game.equals("RoverWatch Origins Edition")) {
                if (yourMoney < 39.99) {
                    System.out.println("Too Expensive");
                } else {
                    yourMoney = yourMoney - 39.99;
                    System.out.printf("Bought %s%n", game);
                }

            } else {
                System.out.println("Not Found");
            }
            if (yourMoney <= 0) {
                System.out.println("Out of money!");
                return;

            }
            input = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", (balance - yourMoney), yourMoney);
    }
}
