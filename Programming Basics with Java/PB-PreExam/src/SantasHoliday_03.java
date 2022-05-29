import java.util.Scanner;

public class SantasHoliday_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysToStay = Integer.parseInt(scanner.nextLine());// dni za prestoi
        String roomKind = scanner.nextLine(); // vid pomeshtenie
        String rating = scanner.nextLine(); // ocenka: positive / negative

        double roomForOnePersonPrice = 18; // cena za edna nosht
        double apartamentPrice = 25; // cena za edna nosht
        double presidentApartmentPrice = 35;// cena za edna noshrt
        int nights = daysToStay - 1;// broi noshtuvki
        double totalSumForNights = 0;
        if (roomKind.equals("room for one person")) {
            if (daysToStay < 10) {
                totalSumForNights = nights * roomForOnePersonPrice;
            } else if (daysToStay > 10 && daysToStay < 15) {
                totalSumForNights = nights * roomForOnePersonPrice;
            } else if (daysToStay > 15) {
                totalSumForNights = nights * roomForOnePersonPrice;
            }

        } else if (roomKind.equals("apartment")) {

            if (daysToStay < 10) {
                totalSumForNights = (nights * apartamentPrice) * 0.70;
            } else if (daysToStay > 10 && daysToStay < 15) {
                totalSumForNights = (nights * apartamentPrice) * 0.65;
            } else if (daysToStay > 15) {
                totalSumForNights = (nights * apartamentPrice) * 0.50;
            }
        } else if (roomKind.equals("president apartment")) {

            if (daysToStay < 10) {
                totalSumForNights = (nights * presidentApartmentPrice) * 0.90;
            } else if (daysToStay > 10 && daysToStay < 15) {
                totalSumForNights = (nights * presidentApartmentPrice) * 0.85;
            } else if (daysToStay > 15) {
                totalSumForNights = (nights * presidentApartmentPrice) * 0.80;
            }
        }
        if (rating.equals("positive")) {
            totalSumForNights = totalSumForNights + (totalSumForNights * 0.25);
        } else if (rating.equals("negative")) {
            totalSumForNights = totalSumForNights - (totalSumForNights * 0.10);
        }
        System.out.printf("%.2f", totalSumForNights);
    }
}
