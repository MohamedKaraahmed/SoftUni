import java.util.Scanner;

public class TruckDriver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmMonthly = Double.parseDouble(scanner.nextLine());
        double salary = 0;

        if (kmMonthly <= 5000) {
            if (season.equals("Spring")) {
                salary = kmMonthly * 0.75;
            } else if (season.equals("Summer")) {
                salary = kmMonthly * 0.90;
            } else if (season.equals("Autumn")) {
                salary = kmMonthly * 0.75;
            } else if (season.equals("Winter")) {
                salary = kmMonthly * 1.05;
            }
        } else if (kmMonthly <= 10000) {
            if (season.equals("Spring")) {
                salary = kmMonthly * 0.95;
            } else if (season.equals("Summer")) {
                salary = kmMonthly * 1.10;
            } else if (season.equals("Autumn")) {
                salary = kmMonthly * 0.95;
            } else if (season.equals("Winter")) {
                salary = kmMonthly * 1.25;
            }
        } else if (kmMonthly <= 20000) {
            if (season.equals("Spring")) {
                salary = kmMonthly * 1.45;
            } else if (season.equals("Summer")) {
                salary = kmMonthly * 1.45;
            } else if (season.equals("Autumn")) {
                salary = kmMonthly * 1.45;
            } else if (season.equals("Winter")) {
                salary = kmMonthly * 1.45;
            }
        }
        System.out.printf("%.2f", (salary * 4) * 0.90);
    }
}
