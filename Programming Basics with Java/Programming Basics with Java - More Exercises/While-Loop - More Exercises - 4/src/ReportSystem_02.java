import java.util.Scanner;

public class ReportSystem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededSum = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int cashOrCard = 0;
        int cashPayment = 0;
        int creditCardPayment = 0;
        double totalCashMoney = 0;
        double totalCreditCardMoney = 0;
        double totalSum = 0;
        while (!command.equals("End")) {
            int sum = Integer.parseInt(command);
            cashOrCard++;
            if (cashOrCard % 2 != 0) {
                if (sum > 100) {
                    System.out.println("Error in transaction!");

                } else {
                    totalCashMoney = totalCashMoney + sum;
                    totalSum = totalCreditCardMoney + totalCashMoney;
                    cashPayment++;
                    System.out.println("Product sold!");
                }
            } else {
                if (sum < 10) {
                    System.out.println("Error in transaction!");

                } else {
                    totalCreditCardMoney = totalCreditCardMoney + sum;
                    totalSum = totalCashMoney + totalCreditCardMoney;
                    creditCardPayment++;
                    System.out.println("Product sold!");
                }
            }
            if (totalSum >= neededSum) {
                System.out.printf("Average CS: %.2f%n", totalCashMoney / cashPayment);
                System.out.printf("Average CC: %.2f%n", totalCreditCardMoney / creditCardPayment);
                break;
            }

            command = scanner.nextLine();
            if (command.equals("End")) {
                if (totalSum <= neededSum) {
                    System.out.println("Failed to collect required money for charity.");
                }
            }
        }

    }
}