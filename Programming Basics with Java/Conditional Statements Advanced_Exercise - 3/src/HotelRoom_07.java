import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        ;
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;
        if (month.equals("May") || month.equals("October")) {
            studioPrice = 50;
            apartmentPrice = 65;
            if (nightsCount > 7 && nightsCount <= 14) {
                studioPrice = (studioPrice * 0.95) * nightsCount;
                apartmentPrice = apartmentPrice * nightsCount;
            } else if (nightsCount > 14) {
                studioPrice = (studioPrice * 0.70) * nightsCount;
                apartmentPrice = (apartmentPrice * 0.90) * nightsCount;
            } else {
                studioPrice = studioPrice * nightsCount;
                apartmentPrice = apartmentPrice * nightsCount;
            }

        } else if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.20;
            apartmentPrice = 68.70;
            if (nightsCount > 14) {
                studioPrice = (studioPrice * 0.80) * nightsCount;
                apartmentPrice = (apartmentPrice * 0.90) * nightsCount;
            } else {
                studioPrice = studioPrice * nightsCount;
                apartmentPrice = apartmentPrice * nightsCount;
            }

        } else if (month.equals("July") || month.equals("August")) {
            studioPrice = 76;
            apartmentPrice = 77;
            if (nightsCount > 14) {
                studioPrice = studioPrice * nightsCount;
                apartmentPrice = (apartmentPrice * 0.90) * nightsCount;
            } else {
                studioPrice = studioPrice * nightsCount;
                apartmentPrice = apartmentPrice * nightsCount;
            }

        }
        System.out.printf("Apartment: %.2f lv. %n Studio: %.2f lv.", apartmentPrice, studioPrice);
    }

}
