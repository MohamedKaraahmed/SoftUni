import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hrizantemiCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int laletaCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double hrizantemiSum = 0;
        double rosesSum = 0;
        double laletaSum = 0;
        double totalSum = 0;
        if (season.equals("Spring")) {
            hrizantemiSum = hrizantemiCount * 2.00;
            rosesSum = rosesCount * 4.10;
            laletaSum = laletaCount * 2.50;

        } else if (season.equals("Summer")) {
            hrizantemiSum = hrizantemiCount * 2.00;
            rosesSum = rosesCount * 4.10;
            laletaSum = laletaCount * 2.50;
        } else if (season.equals("Autumn")) {
            hrizantemiSum = hrizantemiCount * 3.75;
            rosesSum = rosesCount * 4.50;
            laletaSum = laletaCount * 4.15;
        } else if (season.equals("Winter")) {
            hrizantemiSum = hrizantemiCount * 3.75;
            rosesSum = rosesCount * 4.50;
            laletaSum = laletaCount * 4.15;

        }
        totalSum = hrizantemiSum + rosesSum + laletaSum;
        if (season.equals("Spring") && laletaCount >= 7) {
            totalSum = totalSum * 0.95;
        }
        if (season.equals("Winter") && rosesCount >= 10) {
            totalSum = totalSum * 0.90;
        }
        if (holiday.equals("Y")) {
            totalSum = totalSum * 1.15;
        } else if (holiday.equals("N")) {
            totalSum = totalSum;
        }
        if (hrizantemiCount + rosesCount + laletaCount >= 20) {
            totalSum = totalSum * 0.80;
        } else {
            totalSum = totalSum;
        }
        System.out.printf("%.2f", totalSum + 2);

    }
}
