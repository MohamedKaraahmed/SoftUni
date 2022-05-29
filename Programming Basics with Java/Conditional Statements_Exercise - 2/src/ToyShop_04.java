import java.net.DatagramPacket;
import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double trip = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double puzzleSum = puzzle * 2.60;
        double dollsSum = dolls * 3;
        double bearsSum = bears * 4.10;
        double minionsSum = minions * 8.20;
        double trucksSum = trucks * 2;

        double allSum = puzzleSum + dollsSum + bearsSum + minionsSum + trucksSum;

        int toysCount = puzzle + dolls + bears + minions + trucks;

        if (toysCount >= 50) {
            allSum = allSum - (allSum * 0.25);
        }
        allSum = allSum - (allSum * 0.10);
        double diff = Math.abs(allSum - trip);

        if (allSum >= trip) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }


    }

}