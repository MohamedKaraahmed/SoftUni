import java.util.Scanner;

public class BikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorsCount = Integer.parseInt(scanner.nextLine());
        int seniorsCount = Integer.parseInt(scanner.nextLine());
        String layoutKind = scanner.nextLine();
        double totalSum = 0;

        if (layoutKind.equals("trail")) {
            totalSum = (juniorsCount * 5.50) + (seniorsCount * 7);
        } else if (layoutKind.equals("cross-country")) {
            if (juniorsCount + seniorsCount >= 50) {
                totalSum = ((juniorsCount * 8) + (seniorsCount * 9.50)) * 0.75;
            } else {
                totalSum = (juniorsCount * 8) + (seniorsCount * 9.50);
            }
        } else if (layoutKind.equals("downhill")) {
            totalSum = (juniorsCount * 12.25) + (seniorsCount * 13.75);
        } else if (layoutKind.equals("road")) {
            totalSum = (juniorsCount * 20) + (seniorsCount * 21.50);
        }
        totalSum = totalSum * 0.95;
        System.out.printf("%.2f", totalSum);
    }
}
