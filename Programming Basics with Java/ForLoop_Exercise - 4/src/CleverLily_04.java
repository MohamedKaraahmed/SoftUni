import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageLily = Integer.parseInt(scanner.nextLine());
        double washPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int countToys = 0;
        double birthdayMoney = 0;
        double allMoney = 0;
        double takenMoneyFromBrother = 0;
        for (int i = 1; i <= ageLily; i++) {

            if (i % 2 == 0) {
                birthdayMoney = birthdayMoney + 10;
                allMoney = allMoney + birthdayMoney;
                takenMoneyFromBrother++;
            } else {
                countToys++;
            }
        }
        double sumToys = toyPrice * countToys;
        double allMoneyCollected = allMoney + sumToys - takenMoneyFromBrother;
        double diff = Math.abs(allMoneyCollected - washPrice);
        if (allMoneyCollected >= washPrice) {

            System.out.printf("Yes! %.2f", diff);

        } else {

            System.out.printf("No! %.2f", diff);
        }
    }
}
