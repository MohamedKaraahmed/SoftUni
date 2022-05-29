import java.util.Scanner;

public class Moon_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double averageSpeed = Double.parseDouble(scanner.nextLine());
        double fuelLitersFor100Km = Double.parseDouble(scanner.nextLine());
        double timeForGoAndBack = Math.ceil((384400 * 2) / averageSpeed);
        double totalTime = timeForGoAndBack + 3;
        double totalFuel = (fuelLitersFor100Km * (384400 * 2)) / 100;
        System.out.printf("%.0f%n", totalTime);
        System.out.printf("%.0f", totalFuel);

    }
}
