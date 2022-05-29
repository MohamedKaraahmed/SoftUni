import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int statistsNum = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());


        double filmDecor = filmBudget * 0.10;

        if (statistsNum >= 150) {
            clothesPrice = clothesPrice - (clothesPrice * 0.10);
        }
        clothesPrice = clothesPrice;

        double totalSum = filmDecor + (clothesPrice * statistsNum);
        double diff = Math.abs(filmBudget - totalSum);
        if (totalSum > filmBudget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }

    }
}
