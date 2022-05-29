import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cityName = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());

        if (cityName.equals("Sofia")) {
            if (sells >= 0 && sells <= 500) {
                System.out.printf("%.2f", sells * 5.0 / 100);
            } else if (sells > 500 && sells <= 1000) {
                System.out.printf("%.2f", sells * 7.0 / 100);
            } else if (sells > 1000 && sells <= 10000) {
                System.out.printf("%.2f", sells * 8.0 / 100);
            } else if (sells > 10000) {
                System.out.printf("%.2f", sells * 12.0 / 100);
            } else {
                System.out.println("error");
            }

        } else if (cityName.equals("Varna")) {
            if (sells >= 0 && sells <= 500) {
                System.out.printf("%.2f", sells * 4.5 / 100);
            } else if (sells > 500 && sells <= 1000) {
                System.out.printf("%.2f", sells * 7.5 / 100);
            } else if (sells > 1000 && sells <= 10000) {
                System.out.printf("%.2f", sells * 10.0 / 100);
            } else if (sells > 10000) {
                System.out.printf("%.2f", sells * 13.0 / 100);
            } else {
                System.out.println("error");
            }

        } else if (cityName.equals("Plovdiv")) {
            if (sells >= 0 && sells <= 500) {
                System.out.printf("%.2f", sells * 5.50 / 100);
            } else if (sells > 500 && sells <= 1000) {
                System.out.printf("%.2f", sells * 8.0 / 100);
            } else if (sells > 1000 && sells <= 10000) {
                System.out.printf("%.2f", sells * 12.0 / 100);
            } else if (sells > 10000) {
                System.out.printf("%.2f", sells * 14.5 / 100);
            } else {
                System.out.println("error");
            }


        } else {
            System.out.println("error");
        }


    }
}
