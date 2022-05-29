import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double sum = 0;
        double allYourMoney = 0;
        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);
            if (coins == 0.1) {
                sum = sum + 0.10;
            } else if (coins == 0.2) {
                sum = sum + 0.20;
            } else if (coins == 0.5) {
                sum = sum + 0.50;
            } else if (coins == 1.0) {
                sum = sum + 1.0;
            } else if (coins == 2.0) {
                sum = sum + 2.0;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            command = scanner.nextLine();
        }
        command = scanner.nextLine();
        while (!command.equals("End")) {
            String product = command;
            if (command.equals("Nuts")) {
                if (sum >= 2.0) {
                    sum = sum - 2.0;
                    System.out.printf("Purchased %s%n", product);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (command.equals("Water")) {
                if (sum >= 0.70) {
                    sum = sum - 0.70;
                    System.out.printf("Purchased %s%n", product);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (command.equals("Crisps")) {
                if (sum >= 1.50) {
                    sum = sum - 1.50;
                    System.out.printf("Purchased %s%n", product);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (command.equals("Soda")) {
                if (sum >= 0.80) {
                    sum = sum - 0.80;
                    System.out.printf("Purchased %s%n", product);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (command.equals("Coke")) {
                if (sum >= 1.00) {
                    sum = sum - 1.00;
                    System.out.printf("Purchased %s%n", product);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }
            command = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
