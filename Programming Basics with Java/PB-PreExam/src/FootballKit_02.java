import java.util.Scanner;

public class FootballKit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tShirtPrice = Double.parseDouble(scanner.nextLine());// cena na teniska
        double priceToWinBall = Double.parseDouble(scanner.nextLine());// suma koqto da dostigne za
        // da specheli topka

        double shortsPrice = tShirtPrice * 0.75;   //cena na shortite
        double socksPrice = shortsPrice * 0.20; // cena na chorapite
        double bootsPrice = (tShirtPrice + shortsPrice) * 2;// cena na obuvkite

        double allSum = tShirtPrice + shortsPrice + socksPrice + bootsPrice; // obshta suma
        double sumAfterDiscount = allSum * 0.85;
        if (sumAfterDiscount >= priceToWinBall) {
            System.out.printf("Yes, he will earn the world-cup replica ball!%nHis sum is %.2f lv.", sumAfterDiscount);
        } else {
            double neededMoney = priceToWinBall - sumAfterDiscount;
            System.out.printf("No, he will not earn the world-cup replica ball.%nHe needs %.2f lv. more.", neededMoney);
        }
    }
}
