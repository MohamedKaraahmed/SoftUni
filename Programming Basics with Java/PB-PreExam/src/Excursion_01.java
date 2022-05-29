import java.util.Scanner;

public class Excursion_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());
        int transportCards = Integer.parseInt(scanner.nextLine());
        int ticketsCount = Integer.parseInt(scanner.nextLine());

        double pricePerNight = 20 * nightsCount;
        double transportPrice = 1.60 * transportCards;
        double museumTPrice = 6 * ticketsCount;

        double priceForOneMan = pricePerNight + transportPrice + museumTPrice;
        double allSum = priceForOneMan * peopleCount;
        double sumWithAdditionalProcents = allSum + (allSum * 0.25);

        System.out.printf("%.2f", sumWithAdditionalProcents);
    }
}
