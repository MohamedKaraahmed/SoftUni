import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKm = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double sum = 0;
        if (countKm < 20) {
            //taxi

            if (dayOrNight.equals("day")) {
                sum = countKm * 0.79 + 0.70;
            } else if (dayOrNight.equals("night")) {
                sum = countKm * 0.90 + 0.70;
            }

        } else if (countKm < 100) {
            // avtobus
            sum = countKm * 0.09;

        } else {
            //vlak
            sum = countKm * 0.06;
        }
        System.out.printf("%.2f", sum);
    }
}
