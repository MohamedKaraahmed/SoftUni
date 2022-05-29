import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumChange = Double.parseDouble(scanner.nextLine());

        double allMoney = sumChange * 100;

        int coins = 0;
        while (allMoney > 0) {

            if (allMoney >= 200) {
                allMoney = allMoney - 200;
                coins++;
            } else if (allMoney >= 100) {
                allMoney = allMoney - 100;
                coins++;
            } else if (allMoney >= 50) {
                allMoney = allMoney - 50;
                coins++;
            } else if (allMoney >= 20) {
                allMoney = allMoney - 20;
                coins++;
            } else if (allMoney >= 10) {
                allMoney = allMoney - 10;
                coins++;
            } else if (allMoney >= 5) {
                allMoney = allMoney - 5;
                coins++;
            } else if (allMoney >= 2) {
                allMoney = allMoney - 2;
                coins++;
            } else if (allMoney >= 1) {
                allMoney = allMoney - 1;
                coins++;
            } else {
                break;
            }


        }
        System.out.println(coins);
    }
}
