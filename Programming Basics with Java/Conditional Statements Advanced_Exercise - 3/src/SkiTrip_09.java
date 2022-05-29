import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysStay = Integer.parseInt(scanner.nextLine()) - 1;
        String kindRoom = scanner.nextLine();
        String rating = scanner.nextLine();

        double finalPrice = 0;
      
        if (kindRoom.equals("room for one person")) {
            finalPrice = daysStay * 18.00;


        } else if (kindRoom.equals("apartment")) {
            finalPrice = daysStay * 25.00;
            if (daysStay < 10) {
                finalPrice = finalPrice * 0.70;
            } else if (daysStay > 10 && daysStay <= 15) {
                finalPrice = finalPrice * 0.65;
            } else if (daysStay > 15) {
                finalPrice = finalPrice * 0.50;
            }


        } else if (kindRoom.equals("president apartment")) {
            finalPrice = daysStay * 35.00;
            if (daysStay < 10) {
                finalPrice = finalPrice * 0.90;
            } else if (daysStay > 10 && daysStay <= 15) {
                finalPrice = finalPrice * 0.85;
            } else if (daysStay > 15) {
                finalPrice = finalPrice * 0.80;
            }
        }

        if (rating.equals("positive")) {
            finalPrice = finalPrice + (finalPrice * 0.25);
        } else if (rating.equals("negative")) {
            finalPrice = finalPrice - (finalPrice * 0.10);
        }

        System.out.printf("%.2f", finalPrice);
    }
}
