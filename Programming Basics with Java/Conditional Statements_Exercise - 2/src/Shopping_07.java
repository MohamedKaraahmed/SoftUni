import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budgetPeter = Double.parseDouble(scanner.nextLine());
        int countVideoCards = Integer.parseInt(scanner.nextLine());
        int countProcessors = Integer.parseInt(scanner.nextLine());
        int countRam = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = countVideoCards * 250;

        double processorsPrice = videoCardsPrice * 0.35;
        double sumCPU = processorsPrice * countProcessors;

        double ramPrice = videoCardsPrice * 0.10;
        double sumRam = ramPrice * countRam;

        double sum = videoCardsPrice + sumCPU + sumRam;


        if (countVideoCards > countProcessors) {
            sum = sum - sum * 0.15;
        }
        if (budgetPeter >= sum) {
            double moneyLeft = budgetPeter - sum;

            System.out.printf("You have %.2f leva left!", moneyLeft);
        } else {
            double moneyNeeded = sum - budgetPeter;
            System.out.printf("Not enough money! You need %.2f leva more!", moneyNeeded);
        }

    }
}
